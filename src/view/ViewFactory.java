/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import util.Utilidades;

/**
 * Class to execute the view to choose.
 *
 * @author Aketza
 */
public class ViewFactory {

    /**
     *
     * @return The view that the user chooses, in this case console or graph.
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
                    return new SwingViewImplementation();
                default:
                    System.out.println("Introduce un modelo valido.");
            }

        } while (type != 1 || type != 2);

        return null;
    }
}
