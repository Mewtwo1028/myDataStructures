/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basadas_en_Arreglos.disjointSet;

/**
 *
 * @author osmar 
 * Conjunto Disjunto
 */
public class disjointSet {

    int pariente[];
    int rango[];
    int n;
    
    
    public disjointSet(int n) {
        this.n = n;
        rango = new int[n];
        pariente = new int[n];
        crearConjunto();
    }

    public void crearConjunto() {

        for (int i = 0; i < n; i++) {
            pariente[i] = i;
        }
    }

    public int encontrar(int i) {

        if (pariente[i] != i) {
            pariente[i] = encontrar(pariente[i]);
        } 
           return pariente[i];

    }

    public void union(int i, int j) {

        int raizI = encontrar(i);
        int raizJ = encontrar(j);
        
        if (raizI == raizJ){
            return; //Los elementos de un conjunto no se repiten
        }
        
        if (rango[raizI] < rango[raizJ]){
            pariente[raizI] = pariente[raizJ]; 
       }
        
        else if (rango[raizI] > rango[raizJ]){
            
            pariente[raizJ] = pariente[raizI];
        }
        
        else{
            pariente[raizJ] = raizI;
            
            rango[raizI] = rango[raizI] + 1;
                    }
    }

}
