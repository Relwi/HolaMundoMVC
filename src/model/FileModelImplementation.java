/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * Clase que returna el mensaje de un fichero
 *
 * @author Aketza
 */
public class FileModelImplementation implements Model {

    private ResourceBundle rb = ResourceBundle.getBundle("config.config");

    /**
     *
     * @return el mensaje del fichero config y returna el mensaje
     */
    @Override
    public String getGreeting() {
        String greeting = rb.getString("text");
        return greeting;
    }

}
