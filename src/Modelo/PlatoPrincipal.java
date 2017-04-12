package Modelo;

import Controlador.Lista;

public class PlatoPrincipal {

    private String nombre, tiempo;
    private int precio, carbohidratos;
    private Lista ingredientes;

    public PlatoPrincipal(String nombre, int precio, int carbohidratos, String tiempo, Lista ingredientes) {
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.precio = precio;
        this.carbohidratos = carbohidratos;
        this.ingredientes = ingredientes;
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }

    //Precio
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }
    
    //Carbohidratos
    public int getCarbohidratos() {
        return carbohidratos;
    }
    
    public Lista getIngredientes(){
        return this.ingredientes;
    }
}
