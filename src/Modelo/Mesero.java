package Modelo;

import Controlador.Lista;

public class Mesero extends Empleado {

    private String contraseña = "";
    public static int indiceLista = 0;
    public static boolean encontroUsuario = false;
    
    public Mesero(String nombre, int edad, String telefono, String direccion, String contraseña) {
        super(nombre, edad, telefono, direccion);

        this.contraseña = contraseña;
    }
    
    public String getContraseña(){
   
       return this.contraseña;
    }


    public static void comprobacion(String Dato_a_comparar, int i) {//Me permite verificar si el usuario existe, ademas me dice si el usuario es Gerente o tiene otro cargo

        indiceLista = i;
        
        if (i < Controlador.Restaurante.listaDeEmpleados.getTamaño()) {
            
            Mesero m = (Mesero) Controlador.Restaurante.listaDeEmpleados.getPosicion(i).getInfo();
            if (Dato_a_comparar.equals(m.getNombre())) {//Comparacion con el usuario.

                encontroUsuario = true;
            } else {

                encontroUsuario = false;
                comprobacion(Dato_a_comparar, i + 1);
            }
        }
    }
    
}
