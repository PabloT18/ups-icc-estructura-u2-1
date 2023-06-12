/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructuau2;

/**
 *
 * @author pablo
 */
import java.util.Stack;

public class Pila {
    public Pila() {
        Stack<String> pila = new Stack<>();

        // Empujar elementos a la pila
        pila.push("elemento1");
        pila.push("elemento2");
        pila.push("elemento3");

        // Obtener y eliminar el elemento superior de la pila
        String elementoSuperior = pila.pop();
        System.out.println("Elemento superior: " + elementoSuperior);

        // Obtener el elemento superior sin eliminarlo
        String elementoSuperiorActual = pila.peek();
        System.out.println("Elemento superior actual: " + elementoSuperiorActual);

        // Verificar si la pila está vacía
        boolean estaVacia = pila.isEmpty();
        System.out.println("¿La pila está vacía? " + estaVacia);
        System.out.println();
    }
}