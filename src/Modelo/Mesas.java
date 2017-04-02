package Modelo;


public class Mesas {
   
    private int Numero_mesa, Total;
    
    
    public Mesas(int numero_mesa, int Total){
        
        this.Total = Total;
        Numero_mesa = numero_mesa;
    
    }
    
    //Numero de mesa
    
    public int getNumeroMesa(){
        return this.Numero_mesa;
    }
    
    //Total recaudado de la mesa
    
    public int getTotalRecaudado(){
        return this.Total;
    }
}
