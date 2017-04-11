package Modelo;
public class Gerente extends Empleado {

    private String contraseña;
    public static int indiceLista = 0;

    public Gerente(String Nombre, int Edad, String Telefono, String Direccion, String contraseña) {
        super(Nombre, Edad, Telefono, Direccion);
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public static boolean Comprobacion(String Dato_a_comparar, int i) {//Me permite verificar si el usuario existe, ademas me dice si el usuario es Gerente o tiene otro cargo

        indiceLista = i;
        if (i < Controlador.Restaurante.listaDeGerentes.getTamaño()) {

            Gerente m = (Gerente) (Controlador.Restaurante.listaDeGerentes.getPosicion(indiceLista).getInfo());

            if (Dato_a_comparar.equals(m.getNombre())) {//Comparacion con el usuario.

                return true;
            } else {

                Comprobacion(Dato_a_comparar, i + 1);
            }
        }

        return false;
    }
}
