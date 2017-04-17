package Controlador;

import Modelo.Bebida;
import Vista.Reloj;
import Vista.primerIngresoGerente;
import Modelo.Gerente;
import Modelo.Ingrediente;
import Modelo.Mesero;
import Modelo.PlatoPrincipal;
import Modelo.Postre;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;


public class Restaurante {

    public static Lista listaDePlatos = new Lista(), listaDePostres = new Lista(), listaDeBebidas = new Lista(), listaDeEmpleados = new Lista(), listaDeGerentes = new Lista(), listaIngredientesPlato = new Lista(), listaIngredientes = new Lista();
    public static String nombre, unidad;
    public static int cantidad;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (Exception e) {
        }
        try {

            llenarListas(listaDeGerentes, new File("Archivo_Gerente.txt"), "Gerente", "|");
            llenarListas(listaDeEmpleados, new File("Mesero.txt"), "Mesero", "|");
            llenarListas(listaDePlatos, new File("Platos principales.txt"), "Plato", "|");
            llenarListas(listaDePostres, new File("Postres.txt"), "Postre", "|");
            llenarListas(listaDeBebidas, new File("Bebidas.txt"), "Bebida", "|");
            llenarListas(listaIngredientes, new File("Ingredientes.txt"), "Ingrediente", "_");
        } catch (Exception e) {
        }

        Reloj reloj = new Reloj();
        comprobarIngresosAnteriores();
    }
    
    static void comprobarIngresosAnteriores() {
        File Primer_Ingreso = new File("Primer_ingreso.txt");
        Lista Resultado = new Lista();

        try {
            FileReader Lector = new FileReader(Primer_Ingreso);
            try (BufferedReader Lector_X = new BufferedReader(Lector)) {
                Resultado.Agregar(Lector_X.readLine());
                Resultado.Agregar(Lector_X.readLine());
                Resultado.Agregar(Lector_X.readLine());
            }

            if (Resultado.getPosicion(0).getInfo().equals("Ya ha ingresado")) {//verificaciones de si por lo menos ya ha ingresado un gerente.
                new Vista.LogingDeGerente().setVisible(true);
                if (Resultado.getPosicion(1).getInfo().equals("Ya ingreso un mesero")) {
                    new Vista.logingDeMeseros().setVisible(true);
                } else {
                    new Vista.vistaAgregarEmpleados().setVisible(true);
                }

                if (Resultado.getPosicion(2).getInfo().equals("Ya existen tres platos")) {

                    new Vista.vistaCocina().setVisible(true);
                } else {

                    new Vista.vistaAgregarComida().setVisible(true);
                }

            } else {//Esto es encaso de que el gerente no ha sido contratado
                FileWriter Escritor = new FileWriter(Primer_Ingreso);
                try (BufferedWriter Escritor_X = new BufferedWriter(Escritor)) {
                    Escritor_X.write("Ya ha ingresado");
                    Escritor_X.flush();
                }

                primerIngresoGerente ventana = new primerIngresoGerente();
                ventana.setVisible(true);
            }
        } catch (Exception e) {

        }
    }

    static void llenarListas(Lista lista, File archivo, String tipoDeLista, String datoParaSeparar) {

        try {
            FileReader fr = new FileReader(archivo);
            try (BufferedReader br = new BufferedReader(fr)) {
                String linea;
                
                int i = 1;
                while (br.ready()) {
                    i++;
                    linea = br.readLine();
                    separacionMejorada(linea, tipoDeLista, datoParaSeparar, 0);
                }
            }
        } catch (Exception e) {
        }
    }

    public static void separacionMejorada(String registro, String tipoDeLista, String datoParaSeparar, int listaOString) {

        Lista lista = new Lista();
        int inicio = 0, fin = 0;
        for (int j = 0; j < registro.length(); j++) {

            if (registro.substring(j, j + 1).equals(datoParaSeparar)) {

                lista.Agregar(registro.substring(inicio, fin));
                inicio = fin + 1;
                fin = fin + 1;
            } else {

                fin = fin + 1;
            }
        }

        if (listaOString == 0) {
            pedido(tipoDeLista, lista);
        } else {
            separacionIngredientes(lista, 0, 1, 0, 0, 0, "");
        }
    }

    static void pedido(String tipoDeLista, Lista lista) {

        switch (tipoDeLista) {
            case "Mesero":
                Mesero.agregarMesero(lista);
                break;
            case "Postre":
                Postre.agregarPostre(lista);
                break;
            case "Bebida":
                Bebida.agregarBebida(lista);
                break;
            case "Plato":
                PlatoPrincipal.agregarPlatoPrincipal(lista);
                break;
            case "Gerente":
                Gerente.agregarGerente(lista);
                break;
            case "Ingrediente":
                Ingrediente.agregarIngrediente(lista);
                break;
            default:
                break;
        }
    }

    static void separacionIngredientes(Lista lista, int i, int tipo, int inicio, int fin, int j, String ingrediente) {

        if (i < lista.getTamaño()) {

            ingrediente = String.valueOf(lista.getPosicion(i).getInfo());
            if (j < ingrediente.length()) {

                if (ingrediente.substring(j, j + 1).equals("_")) {
                    switch (tipo) {
                        case 1:
                            nombre = ingrediente.substring(inicio, fin);
                            tipo = tipo + 1;
                            break;
                        case 2:
                            cantidad = Integer.parseInt(ingrediente.substring(inicio, fin));
                            tipo = tipo + 1;
                            break;
                        case 3:
                            unidad = ingrediente.substring(inicio, fin);
                            tipo = tipo + 1;
                            break;
                    }
                    inicio = fin + 1;
                }
                fin = fin + 1;
                j = j + 1;
                separacionIngredientes(lista, i, tipo, inicio, fin, j, ingrediente);
            }

            listaIngredientesPlato.Agregar(new Ingrediente(nombre, cantidad, unidad));
            i = i + 1;
            tipo = 1;
            inicio = 0;
            fin = 0;
            j = 0;
            separacionIngredientes(lista, i, tipo, inicio, fin, j, "");
        }
    }
}
