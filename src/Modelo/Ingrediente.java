package Modelo;


public class Ingrediente {
    
    private String nombreIngrediente;
    private int cantidadIngrediente;
    public void Ingrediente(String nombreIngrediente, int cantidadIngrediente){
        this.nombreIngrediente = nombreIngrediente;
        this.cantidadIngrediente = cantidadIngrediente;
    }

    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public int getCantidadIngrediente() {
        return cantidadIngrediente;
    }
    
    public void setCantidadIngredientes(int cantidadingredientes){
        this.cantidadIngrediente = cantidadingredientes;
    }
}
