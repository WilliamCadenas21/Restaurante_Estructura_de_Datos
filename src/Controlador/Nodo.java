package Controlador;

public class Nodo {
    
    Object info;
    Nodo link;//Es tipo nodo, porque este debe contener en si un nodo nuevo por lo que otro tipo daria error a la hora de realizar el enlace.
    
    public Nodo(Object info){//Me crea un nodo nuevo
        this.info = info;
        this.link = null;
    }
    
    public void Enlaza_a(Nodo nodo){//Lo que hace esto es enlazar el nodo anterior con el que recien se creo.
        link = nodo;
    }
    
    public Nodo Siguiente(){//Obtiene el siguiente nodo
        return link;
    }

    public Object getInfo(){   
        return info;
    }

    public void eliminar(){
        this.link = null;
    }
    
    public void CambiarInfo(Object info){   
        this.info = info;
    }

}
