package Modelo;

import Controlador.Lista;
import static Controlador.Restaurante.listaDeBebidas;

public class Bebida {

    private String nombre;
    private int precio, carbohidratos;

    public Bebida(String nombre, int precio, int carbohidratos) {
        this.nombre = nombre;
        this.precio = precio;
        this.carbohidratos = carbohidratos;
    }

    //Nombre
    public String getNombre() {
        return this.nombre;
    }

    //Precio
    public int getPrecio() {
        return this.precio;
    }

    //Carbohidratos
    public int getCarbohidratos() {
        return this.carbohidratos;
    }

    public static void agregarBebida(Lista List) {
        String nombre = (String) List.getPosicion(0).getInfo();
        int precio = Integer.parseInt(String.valueOf(List.getPosicion(1).getInfo()));
        int carbohidratos = Integer.parseInt(String.valueOf(List.getPosicion(2).getInfo()));

        listaDeBebidas.Agregar(new Bebida(nombre, precio, carbohidratos));
    }
}
