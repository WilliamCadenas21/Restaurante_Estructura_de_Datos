package Modelo;

public class PlatoPrincipal{

    private String nombre;
    private int precio, carbohidratos;
        
    
    public PlatoPrincipal(String nombre, int precio, int carbohidratos) {
        
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
