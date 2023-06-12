/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructuau2;

/**
 *
 * @author pablo
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listas {
  public Listas(){
        List<String> lista = new LinkedList<>(); // También se puede utilizar LinkedList

        
         System.out.println("\n ===LISTAS===\n");
        // Agregar elementos a la lista
        lista.add("elemento1");
        lista.add("elemento2");
        lista.add("elemento3");

        // Acceder a un elemento por índice
        String elemento = lista.get(1);
        System.out.println("Elemento en el índice 1: " + elemento);

         System.out.println("Lsita ----->"+ lista);
        // Modificar un elemento
        lista.set(2, "nuevoElemento");
         System.out.println("Modifca elmento 2");
         
         System.out.println("Lsita ----->"+ lista);

        // Verificar si un elemento existe en la lista
        boolean contieneElemento = lista.contains("elemento1");
        System.out.println("¿La lista contiene 'elemento1'? " + contieneElemento);

        // Eliminar un elemento
        lista.remove("elemento2");
        System.out.println("Elimina elemento2");
        System.out.println("Lsita ----->"+ lista);

        // Obtener el tamaño de la lista
        int tamano = lista.size();
        System.out.println("Tamaño de la lista: " + tamano);
        System.out.println();
    }
}
