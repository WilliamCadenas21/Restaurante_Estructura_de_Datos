package Modelo;


public class Comida_auxiliar {
    
    private String Tipo, NombrePlato;
    private int Precio;
    
    public Comida_auxiliar(String Tipo, String NombrePlato, int Precio){
        
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

    public int getPrecio() {
        return Precio;
    }
    
    
}
