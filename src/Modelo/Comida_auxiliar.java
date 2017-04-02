package Modelo;


public class Comida_auxiliar {
    
    private String Tipo, NombrePlato;
    private int Precio, Cantidad;
    
    public Comida_auxiliar(String Tipo, String NombrePlato, int Precio, int Cantidad){
        
        this.Cantidad = Cantidad;
        this.Tipo = Tipo;
        this.NombrePlato = NombrePlato;
        this.Precio = Precio;
    }

    public int getCantidad(){
    
        return this.Cantidad;
    }
    
    public String getTipo() {
        return this.Tipo;
    }

    public String getNombrePlato() {
        return this.NombrePlato;
    }

    public int getPrecio() {
        return this.Precio;
    }
    
    
}
