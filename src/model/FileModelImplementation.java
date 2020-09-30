/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;


/**
 *
 * @author Aketza
 */
public class FileModelImplementation implements Model {
    private ResourceBundle rb = ResourceBundle.getBundle("config.config");
    public String getGreeting(){
        String greeting = null;
        greeting = rb.getString("text");
        return greeting;
    }
    
}
