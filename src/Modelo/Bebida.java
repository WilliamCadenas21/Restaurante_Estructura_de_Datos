package Modelo;


public class Bebida{
    
    private String Nombre;
    private int Precio, Carbohidratos;
    
    public Bebida( String nombre, int precio, int carbohidratos){
    
        Nombre = nombre;
        Precio = precio;
        Carbohidratos = carbohidratos;
        
    }
    
    //Nombre
    
       public String getNombre(){
       
           return Nombre; 
           
       }
       
    //Precio
       
       public int getPrecio(){
       
           return Precio;
       }
    
    //Carbohidratos
       
       public int getCarbohidratos(){
       
           return Carbohidratos;
       
       }
    
}
