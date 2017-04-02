package Modelo;


public class Comida_auxiliar {
    
    private String Tipo, NombrePlato;
    private double Precio;
    
    public Comida_auxiliar(String Tipo, String NombrePlato, double Precio){
        
        this.Tipo = Tipo;
        this.NombrePlato = NombrePlato;
        this.Precio = Precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getNombrePlato() {
        return NombrePlato;
    }

    public double getPrecio() {
        return Precio;
    }
    
    
}
