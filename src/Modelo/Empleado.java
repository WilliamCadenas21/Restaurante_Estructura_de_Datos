package Modelo;

public class Empleado {

    private String Nombre, Direccion, Telefono;
    private int Edad;

    public Empleado(String Nombre, int Edad, String Telefono, String Direccion) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Edad = Edad;
    }

    public void setNombre(String Nombre) {

        this.Nombre = Nombre;

    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

 

    //Nombre
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    //Edad
    public int getEdad() {

        return Edad;

    }

    //Telefono
    public String getTelefono() {

        return Telefono;

    }

    //Direccion
    public String getDireccion() {

        return Direccion;

    }

 
}
