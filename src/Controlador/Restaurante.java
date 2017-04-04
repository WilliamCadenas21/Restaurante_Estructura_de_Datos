package Controlador;

import Vista.Reloj;
import Vista.Primer_ingreso_gerente;
import Modelo.Bebidas;
import Modelo.Gerente;
import Modelo.Mesero;
import Modelo.Plato_principal;
import Modelo.Postre;
import java.io.*;

public class Restaurante {

    public static Lista Lista_de_Platos = new Lista(), Lista_de_Postres = new Lista(), Lista_de_Bebidas = new Lista(), Lista_de_Empleados = new Lista(), Lista_de_Gerentes = new Lista();

    public static void main(String[] args) {
        
        try {
            
            llenarListas(Lista_de_Gerentes, new File("Archivo_Gerente.txt"), "Gerente");
            llenarListas(Lista_de_Empleados, new File("Mesero.txt"), "Mesero");
            llenarListas(Lista_de_Platos, new File("Platos principales.txt"), "Plato");
            llenarListas(Lista_de_Postres, new File("Postres.txt"), "Postre");
            llenarListas(Lista_de_Bebidas, new File("Bebidas.txt"), "Bebida");
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Reloj();
        
        comprobarIngresosAnteriores();
    }

    public static void agregarGerente(Lista List) {

        String str1 = (String) List.getPosicion(0).getInfo();
        int str2 = Integer.parseInt((String) List.getPosicion(1).getInfo());
        String str3 = (String) List.getPosicion(2).getInfo();
        String str4 = (String) List.getPosicion(3).getInfo();
        String str5 = (String) List.getPosicion(4).getInfo();

        Gerente g = new Gerente(str1, str2, str3, str4, str5);

        Lista_de_Gerentes.Agregar(g);

    }

    public static void agregarMesero(Lista List) {

        String str1 = (String) List.getPosicion(0).getInfo();
        int str2 = Integer.parseInt((String) List.getPosicion(1).getInfo());
        String str3 = (String) List.getPosicion(2).getInfo();
        String str4 = (String) List.getPosicion(3).getInfo();
        String str5 = (String) List.getPosicion(4).getInfo();

        Mesero mesero = new Mesero(str1, str2, str3, str4, str5);

        Lista_de_Empleados.Agregar(mesero);

    }

    private static void agregarPostre(Lista List) {

        String str1 = (String) List.getPosicion(0).getInfo();//Nombre
        int str2 = Integer.parseInt(String.valueOf(List.getPosicion(1).getInfo()));//Precio
        int str3 = Integer.parseInt(String.valueOf(List.getPosicion(2).getInfo()));//Carbohidratos
        String str4 = (String) List.getPosicion(3).getInfo();//Tiempo

        Postre postre = new Postre(str1, str2, str3, str4);
        Lista_de_Postres.Agregar(postre);
    }

    private static void agregarBebida(Lista List) {
        String str1 = (String) List.getPosicion(0).getInfo();
        int str2 = Integer.parseInt(String.valueOf(List.getPosicion(1).getInfo()));
        int str3 = Integer.parseInt(String.valueOf(List.getPosicion(2).getInfo()));

        Bebidas bebidas = new Bebidas(str1, str2, str3);

        Lista_de_Bebidas.Agregar(bebidas);
    }

    private static void agregarPlato(Lista List) {
        String str1 = (String) List.getPosicion(0).getInfo();
        int str2 = Integer.parseInt(String.valueOf(List.getPosicion(1).getInfo()));
        int str3 = Integer.parseInt(String.valueOf(List.getPosicion(2).getInfo()));

        Lista_de_Platos.Agregar(new Plato_principal(str1, str3, str3));
    }

    public static void comprobarIngresosAnteriores() {
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
 
                    new Vista.VistaMenu().setVisible(true);
                } else {

                    new Vista.Vista_Agregar_Empleados().setVisible(true);
                }

                if (Resultado.getPosicion(2).getInfo().equals("Ya existen tres platos")) {

                    new Vista.Vista_Cocina().setVisible(true);

                }else{
                    
                    new Vista.Vista_Agregar_Comida().setVisible(true);
                }

            } else {//Esto es encaso de que el gerente no ha sido contratado
                FileWriter Escritor = new FileWriter(Primer_Ingreso);
                BufferedWriter Escritor_X = new BufferedWriter(Escritor);
                Escritor_X.write("Ya ha ingresado");
                Escritor_X.flush();
                Escritor_X.close();

                Primer_ingreso_gerente ventana = new Primer_ingreso_gerente();
                ventana.setVisible(true);
            }
        } catch (Exception e) {
            
        }
    }

    public static void llenarListas(Lista lista, File archivo, String Tipo_de_lista) {

        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int i = 1;
            while (br.ready()) {
                i++;
                line = br.readLine();
                separacionMejorada(line, Tipo_de_lista);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void separacionMejorada(String Registro, String Tipo_de_lista) {

        Lista Lista = new Lista();
        int inicio = 0, fin = 0;

        for (int j = 0; j < Registro.length(); j++) {

            if (Registro.substring(j, j + 1).equals("|")) {

                Lista.Agregar(Registro.substring(inicio, fin));

                inicio = fin + 1;
                fin = fin + 1;
            } else {

                fin = fin + 1;
            }
        }
        
        if (Tipo_de_lista.equals("Mesero")) {
            agregarMesero(Lista);
        } else if (Tipo_de_lista.equals("Postre")) {
            agregarPostre(Lista);
        } else if (Tipo_de_lista.equals("Bebida")) {
            agregarBebida(Lista);
        } else if (Tipo_de_lista.equals("Plato")) {
            agregarPlato(Lista);
        } else if (Tipo_de_lista.equals("Gerente")) {
            agregarGerente(Lista);
        }
        
    }
}
