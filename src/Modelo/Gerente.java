package Modelo;

public class Gerente extends Empleado {

    private String Contraseña;
    public static int Indice_Lista = 0;
    public static boolean Encontro_Usuario;

    public Gerente(String Nombre, int Edad, String Telefono, String Direccion, String Contraseña) {
        super(Nombre, Edad, Telefono, Direccion);

        this.Contraseña = Contraseña;
    }

    public String getContraseña() {
        return this.Contraseña;
    }

    public static void Comprobacion(String Dato_a_comparar, int i) {//Me permite verificar si el usuario existe, ademas me dice si el usuario es Gerente o tiene otro cargo

        Indice_Lista = i;

        if (i < Controlador.Restaurante.listaDeGerentes.getTamaño()) {

            for (int j = 0; j < Controlador.Restaurante.listaDeGerentes.getTamaño(); j++) {
                System.out.println("info: " + Controlador.Restaurante.listaDeGerentes.getPosicion(j).getInfo());
            }
            
            Gerente m = (Gerente) (Controlador.Restaurante.listaDeGerentes.getPosicion(Indice_Lista).getInfo());
            
            System.out.println("m: " + Controlador.Restaurante.listaDeGerentes.getPosicion(Indice_Lista).getInfo());

            if (Dato_a_comparar.equals(m.getNombre())) {//Comparacion con el usuario.

                Encontro_Usuario = true;

            } else {

                Encontro_Usuario = false;

                Comprobacion(Dato_a_comparar, i + 1);

            }

        }

        System.out.println("Foca");
    }

}
