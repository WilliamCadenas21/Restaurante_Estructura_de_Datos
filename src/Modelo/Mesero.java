package Modelo;

import Controlador.Lista;
import static Controlador.Restaurante.listaDeEmpleados;

public class Mesero extends Empleado {

    private String contraseña = "";
    public static int indiceLista = 0;
    public static String variableComprobacionUsuario = "false";

    public Mesero(String nombre, int edad, String telefono, String direccion, String contraseña) {
        super(nombre, edad, telefono, direccion);
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public static void comprobacionUsuario(String Dato_a_comparar, int i) {//Me permite verificar si el usuario existe, ademas me dice si el usuario es Gerente o tiene otro cargo

        indiceLista = i;
        if (i < Controlador.Restaurante.listaDeEmpleados.getTamaño()) {

            Mesero m = (Mesero) Controlador.Restaurante.listaDeEmpleados.getPosicion(i).getInfo();
            if (Dato_a_comparar.equals(m.getNombre())) {//Comparacion con el usuario.
                variableComprobacionUsuario = "true";
            } else {

                comprobacionUsuario(Dato_a_comparar, i + 1);
            }
        }
    }
    
    
    public static void agregarMesero(Lista List) {

        String nombre = (String) List.getPosicion(0).getInfo();
        int edad = Integer.parseInt((String) List.getPosicion(1).getInfo());
        String telefono = (String) List.getPosicion(2).getInfo();
        String direccion = (String) List.getPosicion(3).getInfo();
        String contraseña = (String) List.getPosicion(4).getInfo();

        listaDeEmpleados.Agregar(new Mesero(nombre, edad, telefono, direccion, contraseña));
    }
}
