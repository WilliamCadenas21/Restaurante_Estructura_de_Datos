package Modelo;
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
}
