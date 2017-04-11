package Modelo;
public class ComidaAuxiliar {
    
    private final String tipo, nombrePlato;
    private int precio, cantidad;   
    public ComidaAuxiliar(String Tipo, String NombrePlato, int Precio, int Cantidad){       
        this.cantidad = Cantidad;
        this.tipo = Tipo;
        this.nombrePlato = NombrePlato;
        this.precio = Precio;
    }

    public int getCantidad(){
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
}
