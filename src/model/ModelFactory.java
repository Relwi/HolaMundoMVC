/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import util.Utilidades;

/**
 * Clase para ejecutar el modelo a elegir.
 *
 * @author aketza
 */
public class ModelFactory {

    /**
     *
     * @return el modelo que el usuario elija, en este caso fichero o DB.
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
