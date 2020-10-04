/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import util.Utilidades;

/**
 * Clase para ejecutar la vista a elegir.
 *
 * @author aketza
 */
public class ViewFactory {

    /**
     *
     * @return la vista que el usuario elija, en este caso consola o grafica.
     */
    public View getView() {
        int type = 0;

        do {
            System.out.println("Introduce una vista: 1-Consola 2-Grafica");
            type = Utilidades.leerInt();
            switch (type) {
                case 1:
                    return new ViewImplementation();
                case 2:
                    return new JavaFXViewImplementation();
                default:
                    System.out.println("Introduce un modelo valido.");

            }

        } while (type != 1 || type != 2);

        return null;
    }
}
