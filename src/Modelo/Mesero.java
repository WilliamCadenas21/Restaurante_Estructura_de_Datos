package Modelo;

import Controlador.Lista;

public class Mesero extends Empleado {

    private String Contraseña = "";
    public static int Indice_Lista = 0;
    public static boolean Encontro_Usuario = false;
    
    public Mesero(String Nombre, int Edad, String Telefono, String Direccion, String Contraseña) {
        super(Nombre, Edad, Telefono, Direccion);

        this.Contraseña = Contraseña;
    }
    
    public String getContraseña(){
   
       return this.Contraseña;
    }


    public static void Comprobacion(String Dato_a_comparar, int i) {//Me permite verificar si el usuario existe, ademas me dice si el usuario es Gerente o tiene otro cargo

        Indice_Lista = i;
        
        if (i < Controlador.Restaurante.listaDeEmpleados.getTamaño()) {
            
            Modelo.Mesero m = (Modelo.Mesero) Controlador.Restaurante.listaDeEmpleados.getPosicion(i).getInfo();
            
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
