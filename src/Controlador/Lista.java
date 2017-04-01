package Controlador;

public class Lista{

    private Nodo inicio;//Inicio de la lista
    private Nodo fin;//Fin de la lista
    private Nodo n;//Me funciona como un nodo auxiliar para poder llenar de informacion la lista.
    private Object info;
    private int Tamaño = 0;
    
    public Lista(){
        inicio = null;//Hago el inicio null porque solo creé la lista, más no he insertado aun nodos.
    }

    public void Agregar(Object info){//Sirve para agregar nodos a una lista

        n = new Nodo(info);
        
        if (inicio == null) {//Si aun no se han creado nodos

            inicio = n;//Crea el nodo
            inicio.Enlaza_a(null);//El puntero del nodo apunta, valga la reduncia, a nulo ya que no hay mas nodos al ser este el primero.
        } else {

            
            if (Tamaño == 1) {//En caso de que solo halla un nodo en la lista

                inicio.Enlaza_a(n);
            } else {//En caso de que halla mas de un nodo en la lista, me permite colocar un apuntador al final de la lista, para cada vez que se agrega un nodo. 
                    //Esto sirve  para evitar realizar un ciclo que me recorra toda la lista, para asi despues ingresar el nuevo nodo, en la ultima posición.

                fin.Enlaza_a(n);//El ultimo nodo apunta a el nodo nuevo
            }

            fin = n;//El nodo nuevo se convierte en el ultimo nodo
            fin.Enlaza_a(null);//El nodo fin apunta a nulo al ser el ultimo.
        }

        Tamaño++;
    }

    /**
     * 
     * @param i, funciona para poder recorrer la lista y encontrar el nodo deseado.
     * @return 
     */
    public Nodo getPosicion(int i) {

        if (i >= 0) {
            int j = 0;
            Nodo auxiliar = inicio;//Se crea un nodo auxiliar para poder moverse por la lista sin cambiarla y poder mostrarla.

            while (j < i) {

                auxiliar = auxiliar.Siguiente();//Se realizan saltos en la lista, para poder llegar a el termino deseado.
                j++;
            }

            return auxiliar;
        } else {

            return null;//Retorna nulo en caso de que se ingrese un numero negativo en la lista, no cual no es posible(aparentemente, en realidad si es posible solo que no es conveniente).
        }
    }

    public int getTamaño() {//Longitud de la lista
        return this.Tamaño;
    }
}
