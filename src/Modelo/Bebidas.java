package Modelo;


public class Bebidas {
    
    private String Nombre;
    private double Precio, Carbohidratos;
    
    public Bebidas( String nombre, double precio, double carbohidratos){
    
        Nombre = nombre;
        Precio = precio;
        Carbohidratos = carbohidratos;
        
    }
    
    //Nombre
    
       public String getNombre(){
       
           return Nombre;
           
       }
       
    //Precio
       
       public double getprecio(){
       
           return Precio;
       
       }
    
    //Carbohidratos
       
       public double getCarboidratos(){
       
           return Carbohidratos;
       
       }
    
}
