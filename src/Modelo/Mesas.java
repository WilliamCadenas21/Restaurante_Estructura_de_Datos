package Modelo;


public class Mesas {
    
    private String Nombre_mesero;
    private int Numero_mesas;
    
    
    public Mesas(String nombre_mesero, int numero_mesa){
        
        Nombre_mesero = nombre_mesero;
        Numero_mesas = numero_mesa;
    
    }
    
    //Nombre mesero
    
        String getNombre_mesero(){
        
            return Nombre_mesero;
        
        }
    
}
