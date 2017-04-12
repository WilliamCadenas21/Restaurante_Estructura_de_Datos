package Modelo;

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
        System.out.println("tamaño: " + Controlador.Restaurante.listaDeEmpleados.getTamaño());
        if (i < Controlador.Restaurante.listaDeEmpleados.getTamaño()) {

            Mesero m = (Mesero) Controlador.Restaurante.listaDeEmpleados.getPosicion(i).getInfo();
            if (Dato_a_comparar.equals(m.getNombre())) {//Comparacion con el usuario.
                System.out.println("Mesero: " + m.getNombre());
                variableComprobacionUsuario = "true";
            } else {

                comprobacionUsuario(Dato_a_comparar, i + 1);
            }
        }
    }
}
