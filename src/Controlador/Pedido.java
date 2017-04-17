package Controlador;

public class Pedido {

    private String mesa;
    private int precio;
    private Lista listaComida;
    private String horaPedido;
    private String Mesero;

    public String getHoraPedido() {
        return horaPedido;
    }

    public String getMesero() {
        return Mesero;
    }

    public Pedido(String mesa, Lista listaComida, int precio, String horaPedido, String Mesero) {
        this.mesa = mesa;
        this.precio = precio;
        this.horaPedido = horaPedido;
        this.Mesero = Mesero;
        this.listaComida = listaComida;
    }

    public String getMesa() {
        return this.mesa;
    }

    public int getPrecio() {
        return this.precio;
    }

    public Lista getListaComida() {
        return this.listaComida;
    }
}
