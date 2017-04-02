package Controlador;


public class Pedido {

    private String Mesa;    
    private int Precio;
    private Lista Lista_comida = new Lista();
    
    public Pedido(String Mesa, Lista Lista_comida, int Precio){
        
        this.Lista_comida = Lista_comida;
        this.Mesa = Mesa;
        this.Precio = Precio;
    }

    public String getMesa() {
        return Mesa;
    }

    public int getPrecio() {
        return Precio;
    }

    public Lista getListaComida(){
    
        return this.Lista_comida;
    }
}
