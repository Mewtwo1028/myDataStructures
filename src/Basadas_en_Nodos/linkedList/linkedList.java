
package Basadas_en_Nodos.linkedList;

import Basadas_en_Nodos.Nodo;

/**
 *
 * @author osmar 
 * Esta es conocida como lista simple, o lista enlazada (linked list)
 */
public class linkedList {

    private Nodo ini; //Punteros de inicio y fin
    private Nodo fin;

    public linkedList() {
        ini = null;
        fin = null;
    }

    public Nodo getIni() {
        return ini;
    }

    public Nodo getFin() {
        return fin;
    }

    public boolean insertar(char dato) {

        Nodo nuevo = new Nodo(dato);

        if (nuevo == null) {
            return false;
        }

        if (estaVacia()) {
            ini = fin = nuevo;
            return true;
        }
        fin.setSig(nuevo);
        fin = nuevo;
        return true;
    }

    public boolean estaVacia() {
        return ini == null && fin == null; //Retorna el booleano de la operación AND ini==fin==null?
    }

    private boolean hayUnSoloNodo() {
        return ini == fin; // Retorna el booleano de la operación ini==fin? Si lo son, retorna V, sino F
    }

    public boolean eliminar() {
        if (estaVacia()) {
            return false; // Hay que evitar la fatiga. Se comprueba que no esté vacía antes de eliminar
        }

        if (hayUnSoloNodo()) {
            ini = fin = null; //En caso de que haya un solo nodo, los punteros de ini y fin se aterrizan a null
            return true;
        }

        Nodo temp = ini; //El nodo temporal contiene el puntero de ini
        ini = temp.getSig(); // ahora el puntero de ini contendrá el puntero de siguiente del nodo temporal
        temp.setSig(null); //Eliminamos físicamente, desconectando el puntero siguiente del nodo temporal, aterrizándolo a null
        return true;
    }

}
