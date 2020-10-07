/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * Class that returns the message of a file.
 *
 * @author Aketza
 */
public class FileModelImplementation implements Model {

    private ResourceBundle rb = ResourceBundle.getBundle("config.config");

    /**
     *
     * @return The message from the config file.
     */
    @Override
    public String getGreeting() {
        String greeting = rb.getString("text");
        return greeting;
    }

}
