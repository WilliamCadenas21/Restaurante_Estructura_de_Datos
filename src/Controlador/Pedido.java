package Controlador;


public class Pedido {

    private String Mesa;    
    private double Precio;
    private Lista Lista_comida = new Lista();
    public Pedido(String Mesa, Lista Lista_comida, double Precio){
        
        this.Lista_comida = Lista_comida;
        this.Mesa = Mesa;
        this.Precio = Precio;
    }

    public String getMesa() {
        return Mesa;
    }

    public double getPrecio() {
        return Precio;
    }

}
