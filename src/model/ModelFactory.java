/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import util.Utilidades;

/**
 * Class to run the model to choose.
 *
 * @author Aketza
 */
public class ModelFactory {

    /**
     *
     * @return The model that the user chooses, in this case file or DB.
     */
    public Model getModel() {
        int type = 0;

        do {
            System.out.println("Introduce un modelo: 1-Fichero 2-DB");
            type = Utilidades.leerInt();
            switch (type) {
                case 1:
                    return new FileModelImplementation();
                case 2:
                    return new ServerModelImplementation();
                default:
                    System.out.println("Introduce un modelo valido.");

            }

        } while (type != 1 || type != 2);

        return null;
    }
}
