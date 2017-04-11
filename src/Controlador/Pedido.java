package Controlador;


public class Pedido {

    private String mesa;    
    private int precio;
    private Lista listaComida = new Lista();
    
    public Pedido(String mesa, Lista listaCcomida, int precio){
        
        this.listaComida = listaCcomida;
        this.mesa = mesa;
        this.precio = precio;
    }

    public String getMesa() {
        return mesa;
    }

    public int getPrecio() {
        return precio;
    }

    public Lista getListaComida(){
    
        return this.listaComida;
    }
}
