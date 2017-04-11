package Modelo;
public class Mesa {

    private int numeroMesa, total;

    public Mesa(int numeroMesa, int total) {
        this.total = total;
        this.numeroMesa = numeroMesa;
    }

    //Numero de mesa
    public int getNumeroMesa() {
        return this.numeroMesa;
    }

    //Total recaudado de la mesa
    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
