package Modelo;

import Controlador.Lista;
import static Controlador.Restaurante.listaDePostres;
import static Controlador.Restaurante.listaIngredientesPlato;
import static Controlador.Restaurante.separacionMejorada;

public class Postre {

    private String nombre, tiempo;
    private int precio, carbohidratos;
    private Lista ingredientes;

    public Postre(String nombre, int precio, int carbohidratos, String Tiempo, Lista ingredientes) {

        this.nombre = nombre;
        this.precio = precio;
        this.carbohidratos = carbohidratos;
        this.tiempo = Tiempo;
        this.ingredientes = ingredientes;
    }

    //Nombre
    public String getNombre() {
        return this.nombre;
    }

    //Precio
    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //Carbohidratos
    public int getCarbohidratos() {
        return carbohidratos;
    }

    //Tiempo
    public String getTiempo() {
        return this.tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public Lista getIngredientes() {
        return this.ingredientes;
    }

    public static Lista getIngredientes(String nombrePlato) {
        
        Lista listaIngredientes = new Lista();
        boolean variableBooleana = true;
        int i = 0;
        while (i < listaDePostres.getTamaño() && variableBooleana) {
            Postre p = (Postre) listaDePostres.getPosicion(i).getInfo();
            if (nombrePlato.equals(p.getNombre())) {
                listaIngredientes = p.getIngredientes();
                variableBooleana = false;
            }
            i++;
        }
        return listaIngredientes;
    }
    
    public static void agregarPostre(Lista List) {

        String nombre = (String) List.getPosicion(0).getInfo();//Nombre
        int precio = Integer.parseInt(String.valueOf(List.getPosicion(1).getInfo()));//Precio
        int carbohidratos = Integer.parseInt(String.valueOf(List.getPosicion(2).getInfo()));//Carbohidratos
        String tiempo = (String) List.getPosicion(3).getInfo();//Tiempo

        separacionMejorada(String.valueOf(List.getPosicion(4).getInfo()), "", ",", 1);
        listaDePostres.Agregar(new Postre(nombre, precio, carbohidratos, tiempo, listaIngredientesPlato));
        listaIngredientesPlato = new Lista();
    }
}
