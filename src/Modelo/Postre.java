package Modelo;


public class Postre {
    
    private String Nombre, Tiempo;
    private int Precio, Carbohidratos;
    
    public Postre(String nombre, int precio, int carbohidratos, String Tiempo){
    
        Nombre = nombre;
        Precio = precio;
        Carbohidratos = carbohidratos;
        this.Tiempo = Tiempo;
    }
    
   //Nombre
    
       public String getNombre(){
       
           return Nombre;
           
       }
       
    //Precio
       
       public int getPrecio(){
       
           return Precio;
       
       }
    
       public void setPrecio(int precio){
       
           this.Precio = precio;
       }
       
    //Carbohidratos
       
       public int getCarbohidratos(){
       
           return Carbohidratos;
       
       } 
       
    //Tiempo
       
       public String getTiempo(){
           
           return this.Tiempo;
       }
       
       public void setTiempo(String tiempo){
           
           this.Tiempo = tiempo;
       }
}
