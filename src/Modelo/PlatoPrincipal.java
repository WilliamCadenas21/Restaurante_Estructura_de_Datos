package Modelo;

public class PlatoPrincipal{

    private String nombre, tiempo;
    private int precio, carbohidratos;
        
    
    public PlatoPrincipal(String nombre, int precio, int carbohidratos, String tiempo) {
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.precio = precio;
        this.carbohidratos = carbohidratos;
        
    }
   
    //Nombre
    
       public String getNombre(){
       
           return nombre;
           
       }
       
    //Precio
       
       public int getPrecio(){
       
           return precio;
       }
    
    //Carbohidratos
       
       public int getCarbohidratos(){
       
           return carbohidratos;
       
       }
       
}
