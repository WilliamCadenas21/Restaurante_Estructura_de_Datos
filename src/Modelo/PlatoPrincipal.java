package Modelo;

import Controlador.Lista;
import Controlador.Restaurante;
import static Controlador.Restaurante.listaDePlatos;
import static Controlador.Restaurante.listaIngredientesPlato;
import static Controlador.Restaurante.separacionMejorada;

public class PlatoPrincipal {

    private String nombre, tiempo;
    private int precio, carbohidratos;
    private Lista ingredientes;

    public PlatoPrincipal(String nombre, int precio, int carbohidratos, String tiempo, Lista ingredientes) {
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.precio = precio;
        this.carbohidratos = carbohidratos;
        this.ingredientes = ingredientes;
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }

    //Precio
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //Carbohidratos
    public int getCarbohidratos() {
        return carbohidratos;
    }

    public Lista getIngredientes() {
        return this.ingredientes;
    }

    public static Lista getIngredientes(String nombrePlato) {
        
        Lista listaIngredientes = new Lista();
        boolean variableBooleana = true;
        int i = 0;
        while (i < listaDePlatos.getTamaño() && variableBooleana) {
            PlatoPrincipal p = (PlatoPrincipal) listaDePlatos.getPosicion(i).getInfo();
            if (nombrePlato.equals(p.getNombre())) {
                listaIngredientes = p.getIngredientes();
                variableBooleana = false;
            }
            i++;
        }
        return listaIngredientes;
    }

    public static void agregarPlatoPrincipal(Lista List) {
        String str1 = (String) List.getPosicion(0).getInfo();
        int str2 = Integer.parseInt(String.valueOf(List.getPosicion(1).getInfo()));
        int str3 = Integer.parseInt(String.valueOf(List.getPosicion(2).getInfo()));

        separacionMejorada(String.valueOf(List.getPosicion(3).getInfo()), "", ",", 1);
        listaDePlatos.Agregar(new PlatoPrincipal(str1, str2, str3, "0:00", listaIngredientesPlato));
        listaIngredientesPlato = new Lista();
    }
}
