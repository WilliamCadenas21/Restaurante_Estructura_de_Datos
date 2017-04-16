package Modelo;

import Controlador.Lista;

public class ComidaAuxiliar {

    private final String tipo, nombrePlato;
    private int precio, cantidad;
    private Lista ingredientes = new Lista();

    /**
     * Obtiene la informacion suficiente de un plato sin buscar en las listas
     * como: platoPrincipal, postre...etc.
     */
    public ComidaAuxiliar(String Tipo, String NombrePlato, int Precio, int Cantidad, Lista ingredientes) {
        this.cantidad = Cantidad;
        this.tipo = Tipo;
        this.nombrePlato = NombrePlato;
        this.precio = Precio;
        this.ingredientes = ingredientes;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getNombrePlato() {
        return this.nombrePlato;
    }

    public int getPrecio() {
        return this.precio;
    }

    public Lista getIngredientes() {
        return this.ingredientes;
    }
}
