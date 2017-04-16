package Controlador;

import Vista.Reloj;
import Vista.primerIngresoGerente;
import Modelo.Bebida;
import Modelo.Gerente;
import Modelo.Mesero;
import Modelo.PlatoPrincipal;
import Modelo.Postre;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Restaurante {

    public static Lista listaDePlatos = new Lista(), listaDePostres = new Lista(), listaDeBebidas = new Lista(), listaDeEmpleados = new Lista(), listaDeGerentes = new Lista();

    public static void main(String[] args) {

        try {

            llenarListas(listaDeGerentes, new File("Archivo_Gerente.txt"), "Gerente");
            llenarListas(listaDeEmpleados, new File("Mesero.txt"), "Mesero");
            llenarListas(listaDePlatos, new File("Platos principales.txt"), "Plato");
            llenarListas(listaDePostres, new File("Postres.txt"), "Postre");
            llenarListas(listaDeBebidas, new File("Bebidas.txt"), "Bebida");
        } catch (Exception e) {

            e.printStackTrace();
        }

        new Reloj();
        comprobarIngresosAnteriores();
    }

    static void agregarGerente(Lista List) {

        String str1 = (String) List.getPosicion(0).getInfo();
        int str2 = Integer.parseInt((String) List.getPosicion(1).getInfo());
        String str3 = (String) List.getPosicion(2).getInfo();
        String str4 = (String) List.getPosicion(3).getInfo();
        String str5 = (String) List.getPosicion(4).getInfo();

        listaDeGerentes.Agregar(new Gerente(str1, str2, str3, str4, str5));
    }

    static void agregarMesero(Lista List) {

        String str1 = (String) List.getPosicion(0).getInfo();
        int str2 = Integer.parseInt((String) List.getPosicion(1).getInfo());
        String str3 = (String) List.getPosicion(2).getInfo();
        String str4 = (String) List.getPosicion(3).getInfo();
        String str5 = (String) List.getPosicion(4).getInfo();

        listaDeEmpleados.Agregar(new Mesero(str1, str2, str3, str4, str5));
    }

    static void agregarPostre(Lista List) {

        String str1 = (String) List.getPosicion(0).getInfo();//Nombre
        int str2 = Integer.parseInt(String.valueOf(List.getPosicion(1).getInfo()));//Precio
        int str3 = Integer.parseInt(String.valueOf(List.getPosicion(2).getInfo()));//Carbohidratos
        String str4 = (String) List.getPosicion(3).getInfo();//Tiempo

        listaDePostres.Agregar(new Postre(str1, str2, str3, str4));
    }

    static void agregarBebida(Lista List) {
        String str1 = (String) List.getPosicion(0).getInfo();
        int str2 = Integer.parseInt(String.valueOf(List.getPosicion(1).getInfo()));
        int str3 = Integer.parseInt(String.valueOf(List.getPosicion(2).getInfo()));

        listaDeBebidas.Agregar(new Bebida(str1, str2, str3));
    }

    static void agregarPlatoPrincipal(Lista List) {
        String str1 = (String) List.getPosicion(0).getInfo();
        int str2 = Integer.parseInt(String.valueOf(List.getPosicion(1).getInfo()));
        int str3 = Integer.parseInt(String.valueOf(List.getPosicion(2).getInfo()));

        listaDePlatos.Agregar(new PlatoPrincipal(str1, str2, str3, "0:00", new Lista()));
    }

    static void comprobarIngresosAnteriores() {
        File Primer_Ingreso = new File("Primer_ingreso.txt");
        Lista Resultado = new Lista();

        try {
            FileReader Lector = new FileReader(Primer_Ingreso);
            BufferedReader Lector_X = new BufferedReader(Lector);

            Resultado.Agregar(Lector_X.readLine());
            Resultado.Agregar(Lector_X.readLine());
            Resultado.Agregar(Lector_X.readLine());

            Lector_X.close();

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
                BufferedWriter Escritor_X = new BufferedWriter(Escritor);
                Escritor_X.write("Ya ha ingresado");
                Escritor_X.flush();
                Escritor_X.close();

                primerIngresoGerente ventana = new primerIngresoGerente();
                ventana.setVisible(true);
            }
        } catch (Exception e) {

        }
    }

    static void llenarListas(Lista lista, File archivo, String tipoDeLista) {

        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            int i = 1;
            while (br.ready()) {
                i++;
                linea = br.readLine();
                separacionMejorada(linea, tipoDeLista, "|", 0);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void separacionMejorada(String registro, String tipoDeLista, String datoParaSeparar, int listaOString) {

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
        }
    }

    static void pedido(String tipoDeLista, Lista lista) {

        if (tipoDeLista.equals("Mesero")) {
            agregarMesero(lista);
        } else if (tipoDeLista.equals("Postre")) {
            agregarPostre(lista);
        } else if (tipoDeLista.equals("Bebida")) {
            agregarBebida(lista);
        } else if (tipoDeLista.equals("Plato")) {
            agregarPlatoPrincipal(lista);
        } else if (tipoDeLista.equals("Gerente")) {
            agregarGerente(lista);
        }
    }
}
