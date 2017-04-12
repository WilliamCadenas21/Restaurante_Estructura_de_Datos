package Modelo;

import Controlador.Lista;

public class Mesa {

    private Lista pedidos;
    private String nuemroDeMesa;
    private double totalGancias;
    
    
    public Mesa(Lista pedidos, String nuemroDeMesa, double totalGancias) {
        this.pedidos = pedidos;
        this.nuemroDeMesa = nuemroDeMesa;
        this.totalGancias = totalGancias;
    } 

    public Lista getPedidos() {
        return pedidos;
    }

    public void setPedidos(Lista pedidos) {
        this.pedidos = pedidos;
    }

    public String getNuemroDeMesa() {
        return nuemroDeMesa;
    }

    public double getTotalGancias() {
        return totalGancias;
    }

    public void setTotalGancias(double totalGancias) {
        this.totalGancias = totalGancias;
    } 
}
