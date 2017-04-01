package Controlador;

import Vista.Primer_ingreso_gerente;
import Modelo.Bebidas;
import Modelo.Gerente;
import Modelo.Logica;
import Modelo.Mesero;
import Modelo.Plato_principal;
import Modelo.Postre;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Restaurante {

    static Scanner sc = new Scanner(System.in);
    
    public static Lista Lista_de_Platos = new Lista(), Lista_de_Postres = new Lista(), Lista_de_Bebidas = new Lista(), Lista_de_Empleados = new Lista(), Lista_de_Gerentes = new Lista();

    public static void main(String[] args) {

        try {
            llenarListas(Lista_de_Gerentes, new File("Archivo_Gerente.txt"), "Gerente");
            llenarListas(Lista_de_Empleados, new File("Mesero.txt"), "Mesero");
            llenarListas(Lista_de_Platos, new File("Platos principales.txt"), "Platos");
            llenarListas(Lista_de_Postres, new File("Postres.txt"), "Postres");
            llenarListas(Lista_de_Bebidas, new File("Bebidas.txt"), "Bebidas");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        new Vista.Vista_Menu().setVisible(true);
        new Vista.Vista_Menu_Gerente().setVisible(true);
        new Vista.Vista_Cocina().setVisible(true);
        
        System.out.println("HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASFASDFASDF");
        
    }

    public static void agregarGerente(Lista List){
        
        String str1 = (String) List.getPosicion(0).ObtenerInfo();
        int str2 = Integer.parseInt((String) List.getPosicion(1).ObtenerInfo());
        String str3 = (String) List.getPosicion(2).ObtenerInfo();
        String str4 = (String) List.getPosicion(3).ObtenerInfo();
        String str5 = (String) List.getPosicion(4).ObtenerInfo();

        Gerente g = new Gerente(str1, str2, str3, str4, str5);

        Lista_de_Gerentes.Agregar(g);
        
        System.out.println("TAMAÑO: " + Lista_de_Gerentes.getTamaño());
        
        System.out.println("Lista de gerentes: " + Lista_de_Gerentes.getPosicion(4).ObtenerInfo());//No me esta agregando un objeto gerente sino los atributos.
    }
    
    public static void agregarMesero(Lista List) {

        String str1 = (String) List.getPosicion(0).ObtenerInfo();
        int str2 = Integer.parseInt((String) List.getPosicion(1).ObtenerInfo());
        String str3 = (String) List.getPosicion(2).ObtenerInfo();
        String str4 = (String) List.getPosicion(3).ObtenerInfo();
        String str5 = (String) List.getPosicion(4).ObtenerInfo();
        
        Mesero mesero = new Mesero(str1, str2, str3, str4, str5);
        Lista_de_Empleados.Agregar(mesero);
        System.out.println("todo bien");
    }

    private static void agregarPostre(Lista List) {
        String str1 = (String) List.getPosicion(0).ObtenerInfo();
        double str2 = (double) List.getPosicion(1).ObtenerInfo();
        double str3 = (double) List.getPosicion(2).ObtenerInfo();
        
        Postre postre = new Postre(str1, str2, str3);
        Lista_de_Postres.Agregar(postre);
        
        System.out.println("Postre agregado");
    }

    private static void agregarBebida(Lista List) {
        String str1 = (String) List.getPosicion(0).ObtenerInfo();
        double str2 = (double) List.getPosicion(1).ObtenerInfo();
        double str3 = (double) List.getPosicion(2).ObtenerInfo();
        
        Bebidas bebidas = new Bebidas(str1, str2, str3);
        Lista_de_Bebidas.Agregar(bebidas);
        
        System.out.println("Bebida agregada");
    }

    private static void agregarPlato(Lista List) {
        String str1 = (String) List.getPosicion(0).ObtenerInfo();
        double str2 = (double) List.getPosicion(1).ObtenerInfo();
        double str3 = (double) List.getPosicion(2).ObtenerInfo();

        Lista_de_Platos.Agregar(new Plato_principal(str1, str3, str3));
        
        System.out.println("Plato principal agregado");
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

            if (Resultado.getPosicion(0).ObtenerInfo().equals("Ya ha ingresado")) {//verificaciones de si por lo menos ya ha ingresado un gerente.
                
                new Vista.Vista_Menu_Gerente().setVisible(true);
                
                if (Resultado.getPosicion(1).ObtenerInfo().equals("Ya ingreso un mesero")) {
                    
                     new Vista.Vista_Menu().setVisible(true);
                    
                    if (Resultado.getPosicion(2).ObtenerInfo().equals("Ya existen tres platos")) {
                        
                       new Vista.Vista_Cocina().setVisible(true);

                    }

                } else {
                    // TODO implementar mesro
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
            String line = "";
            System.out.println("procede a separar los campos");
            int i = 1;
            while (br.ready()) {
                System.out.println("numeor:" + i);
                i++;
                line = br.readLine();
                System.out.println(line);
                separacionMejorada(line, 0, 0, 0, 0, lista, Tipo_de_lista);
            }
            
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void separacionMejorada(String Registro, int i, int Inicio, int Fin, int Posicion, Lista List, String Tipo_de_lista) {

        if (i < Registro.length()) {
            if (Registro.substring(Posicion, Posicion + 1).equals("|")) {
                List.Agregar(Registro.substring(Inicio, Fin));
                System.out.println(Registro.substring(Inicio, Fin));
                //Comprobacion_Y_Llenado_De_Listas(Registro.substring(Inicio, Fin), Lista);
                separacionMejorada(Registro, i + 1, Fin + 1, Fin + 1, Posicion + 1, List, Tipo_de_lista);
            } else {
                separacionMejorada(Registro, i + 1, Inicio, Fin + 1, Posicion + 1, List, Tipo_de_lista);
            }
        } else {
            System.out.println("llama agregar");
            
            if (Tipo_de_lista.equals("Mesero")) {
                agregarMesero(List);
            }else if (Tipo_de_lista.equals("Postre")) {
                agregarPostre(List);
            }else if (Tipo_de_lista.equals("Bebida")) {
                agregarBebida(List);
            }else if (Tipo_de_lista.equals("Plato")) {
                agregarPlato(List);
            }else if (Tipo_de_lista.equals("Gerente")) {
                agregarGerente(List);
            }
        }

    }
}
