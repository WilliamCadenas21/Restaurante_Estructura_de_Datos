package Modelo;


public class Postre {
    
    private String Nombre, Tiempo;
    private double Precio, Carbohidratos;
    
    public Postre(String nombre, double precio, double carbohidratos, String Tiempo){
    
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
       
       public double getPrecio(){
       
           return Precio;
       
       }
    
       public void setPrecio(double precio){
       
           this.Precio = precio;
       }
       
    //Carbohidratos
       
       public double getCarboidratos(){
       
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
