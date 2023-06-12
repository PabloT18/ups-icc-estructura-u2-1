/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructuau2;

/**
 *
 * @author pablo
 */
public class MainController {

    private final View view;

    public MainController(View view) {

        this.view = view;
    }

    public void iniciar() {
        int opcionPrincipal = -1;

//        while (opcionPrincipal != 0) {
        while (opcionPrincipal != 0) {

            opcionPrincipal = view.mostrarMenuPrincipal();

            // Instancia de [dato] segun la opcion escogida
            switch (opcionPrincipal) {
                case 1:
                    Pila p = new Pila();
                    break;
                case 2:
                    Cola c = new Cola();
break;
                case 3:
                    Listas l = new Listas();
break;
                case 0:
                    view.mostrarMensaje("Saliendo del programa...");
                    System.exit(0);
                default:
                    view.mostrarMensaje("Opción inválida");
                    break;
            }
        }
    }

}
