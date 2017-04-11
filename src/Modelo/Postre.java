package Modelo;

public class Postre {

    private String nombre, tiempo;
    private int precio, carbohidratos;

    public Postre(String nombre, int precio, int carbohidratos, String Tiempo) {

        this.nombre = nombre;
        this.precio = precio;
        this.carbohidratos = carbohidratos;
        this.tiempo = Tiempo;
    }

    //Nombre
    public String getNombre() {
        return this.nombre;
    }

    //Precio
    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //Carbohidratos
    public int getCarbohidratos() {
        return carbohidratos;
    }

    //Tiempo
    public String getTiempo() {
        return this.tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}
