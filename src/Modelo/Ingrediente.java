package Modelo;

import Controlador.Lista;
import Controlador.Restaurante;
import static Controlador.Restaurante.listaDePlatos;
import static Controlador.Restaurante.listaIngredientes;

public class Ingrediente {

    private String nombreIngrediente;
    private int cantidadIngrediente;
    private String unidad;
    public static Lista platosQueNoSePuedenRealizar = new Lista();

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
    }

    public static Lista busquedaIngredientes(Lista listaPlatos) {

        int i = 0;
        boolean encontro = true;
        while (i < listaPlatos.getTamaño()) {
            ComidaAuxiliar comidaAuxiliar = (ComidaAuxiliar) listaPlatos.getPosicion(i).getInfo();
            Lista ingredientes = comidaAuxiliar.getIngredientes();
            int j = 0;
            encontro = true;
            while (j < ingredientes.getTamaño() && encontro) {
                Ingrediente ingre = (Ingrediente) ingredientes.getPosicion(j).getInfo();
                String nombre = ingre.getNombreIngrediente();

                int h = 0;
                while (h < listaIngredientes.getTamaño() && encontro) {

                    Ingrediente ingre1 = (Ingrediente) listaIngredientes.getPosicion(h).getInfo();
                    String nombre1 = ingre1.getNombreIngrediente();

                    if (nombre1.equals(nombre)) {

                        if (ingre1.getCantidadIngrediente() <=  0) {
                            System.out.println("el plato '"+comidaAuxiliar.getNombrePlato() + "' no se puede realizar");
                            platosQueNoSePuedenRealizar.Agregar(comidaAuxiliar);
                            encontro = false;
                        }
                    }
                    h++;
                }
                j++;
            }
            i++;
        }

        return new Lista();
    }
}
