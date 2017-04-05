package Modelo;

public class platoPrincipal{

    private String nombre;
    private int precio, carbohidratos;
        
    
    public platoPrincipal(String nombre, int precio, int carbohidratos) {
        
        this.nombre = nombre;
        this.precio = precio;
        this.carbohidratos = carbohidratos;
        
    }
   
    //Nombre
    
       public String getNombre(){
       
           return nombre;
           
       }
       
    //Precio
       
       public int getprecio(){
       
           return precio;
       }
    
    //Carbohidratos
       
       public int getCarboidratos(){
       
           return carbohidratos;
       
       }
       
}
