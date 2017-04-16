package Modelo;

import Controlador.Lista;
import static Controlador.Restaurante.listaDeGerentes;

public class Gerente extends Empleado {

    private String contraseña;
    public static int indiceLista = 0;
    public static String variableComprobacionUsuario = "false";

    public Gerente(String Nombre, int Edad, String Telefono, String Direccion, String contraseña) {
        super(Nombre, Edad, Telefono, Direccion);
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public static void Comprobacion(String Dato_a_comparar, int i) {//Me permite verificar si el usuario existe, ademas me dice si el usuario es Gerente o tiene otro cargo

        indiceLista = i;
        if (i < Controlador.Restaurante.listaDeGerentes.getTamaño()) {

            Gerente m = (Gerente) (Controlador.Restaurante.listaDeGerentes.getPosicion(indiceLista).getInfo());

            if (Dato_a_comparar.equals(m.getNombre())) {//Comparacion con el usuario.
                variableComprobacionUsuario = "true";
            } else {

                Comprobacion(Dato_a_comparar, i + 1);
            }
        }
    }
    
    public static void agregarGerente(Lista List) {

        String nombre = (String) List.getPosicion(0).getInfo();
        int edad = Integer.parseInt((String) List.getPosicion(1).getInfo());
        String telefono = (String) List.getPosicion(2).getInfo();
        String direccion = (String) List.getPosicion(3).getInfo();
        String contraseña = (String) List.getPosicion(4).getInfo();

        listaDeGerentes.Agregar(new Gerente(nombre, edad, telefono, direccion, contraseña));
    }
}
