package Modelo;

import Controlador.Lista;
import Controlador.Restaurante;
import static Controlador.Restaurante.listaIngredientes;

public class Ingrediente {

    private String nombreIngrediente;
    private int cantidadIngrediente;
    private String unidad;

    public Ingrediente(String nombreIngrediente, int cantidadIngrediente, String unidad) {
        this.nombreIngrediente = nombreIngrediente;
        this.cantidadIngrediente = cantidadIngrediente;
        this.unidad = unidad;
    }

    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public int getCantidadIngrediente() {
        return cantidadIngrediente;
    }

    public void setCantidadIngredientes(int cantidadingredientes) {
        this.cantidadIngrediente = cantidadingredientes;
    }

    public String getUnidad() {
        return this.unidad;
    }
    
    
    public static void agregarIngrediente(Lista ingrediente) {

        Restaurante.nombre = String.valueOf(ingrediente.getPosicion(0).getInfo());
        Restaurante.cantidad = Integer.parseInt(String.valueOf(ingrediente.getPosicion(1).getInfo()));
        Restaurante.unidad = String.valueOf(ingrediente.getPosicion(2).getInfo());

        listaIngredientes.Agregar(new Ingrediente(Restaurante.nombre, Restaurante.cantidad, Restaurante.unidad));
        for (int i = 0; i < listaIngredientes.getTamaño(); i++) {
            System.out.println("Ingrediente: " + ((Ingrediente) listaIngredientes.getPosicion(i).getInfo()).getNombreIngrediente());
        }
    }
    
    public static Lista busquedaIngredientes(String tipo, String nombrePlato, int primerIngreso){
        
        if (tipo.equals("Plato") && primerIngreso == 0) {
            Lista lista = Restaurante.listaDePlatos;
        }else if (tipo.equals("Postre") && primerIngreso == 0) {
            Lista lista = Restaurante.listaDePostres;
        }
        
//        
        return new Lista();
    }
}
