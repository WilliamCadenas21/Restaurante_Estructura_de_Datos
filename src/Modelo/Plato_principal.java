package Modelo;

public class Plato_principal{

    private String nombre;
    private double precio, carbohidratos;
        
    
    public Plato_principal(String nombre, double precio, double carbohidratos) {
        
        this.nombre = nombre;
        this.precio = precio;
        this.carbohidratos = carbohidratos;
        
    }
   
    //Nombre
    
       public String getNombre(){
       
           return nombre;
           
       }
       
    //Precio
       
       public double getprecio(){
       
           return precio;
       
       }
    
    //Carbohidratos
       
       public double getCarboidratos(){
       
           return carbohidratos;
       
       }
       
}
