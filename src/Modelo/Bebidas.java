package Modelo;


public class Bebidas {
    
    private String Nombre;
    private int Precio, Carbohidratos;
    
    public Bebidas( String nombre, int precio, int carbohidratos){
    
        Nombre = nombre;
        Precio = precio;
        Carbohidratos = carbohidratos;
        
    }
    
    //Nombre
    
       public String getNombre(){
       
           return Nombre; 
           
       }
       
    //Precio
       
       public int getprecio(){
       
           return Precio;
       }
    
    //Carbohidratos
       
       public int getCarboidratos(){
       
           return Carbohidratos;
       
       }
    
}
