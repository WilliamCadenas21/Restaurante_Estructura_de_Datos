package Modelo;

import Controlador.Nodo;

public class Restaurante {

    private String Nombre,nit,direccion;
    private Nodo Lista_Platos,Lista_Postres,Lista_Bebidas, Lista_de_Empleados;
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Nodo getLista_Platos() {
        return Lista_Platos;
    }

    public void setLista_Platos(Nodo Lista_Platos) {
        this.Lista_Platos = Lista_Platos;
    }

    public Nodo getLista_Postres() {
        return Lista_Postres;
    }

    public void setLista_Postres(Nodo Lista_Postres) {
        this.Lista_Postres = Lista_Postres;
    }

    public Nodo getLista_Bebidas() {
        return Lista_Bebidas;
    }

    public void setLista_Bebidas(Nodo Lista_Bebidas) {
        this.Lista_Bebidas = Lista_Bebidas;
    }
    
    
}
