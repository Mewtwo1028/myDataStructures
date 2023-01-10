/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basadas_en_Nodos;

/**
 *
 * @author osmar
 */
public class Nodo {
    char dato;
    Nodo sig;
    
    public Nodo (char dato){
        this.dato = dato;
        this.sig = null;
    }
    
        public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
