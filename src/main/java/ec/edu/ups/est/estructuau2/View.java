/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructuau2;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class View {
    

    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenuPrincipal() {
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1. pilas");
        System.out.println("2. Colas");
        System.out.println("3. Listas");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt();
//        scanner.nextLine();
        return opcion;
    }
    
     /// Muestra un mensaje como nivel 1
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    /// Muestra un mensaje como nivel 2
    public void mostrarMensaje(String mensaje, int nivel) {
        StringBuilder tabs = new StringBuilder(); // Crear un StringBuilder para almacenar las tabulaciones

        for (int i = 0; i < nivel; i++) {
            tabs.append("\t"); // Agregar una tabulación al StringBuilder en cada iteración
        }
        System.out.println(tabs.toString() + mensaje); // Imprimir las tabulaciones seguidas del mensaje
    }
}