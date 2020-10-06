/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 * 
 * @author Iker
 */
public class ModelImplementation implements Model {

    /**
     *
     * @return Return the message.
     */
    @Override
    public String getGreeting() {
        String greeting = null;
        System.out.println("Introduce el saludo: ");
        Scanner greetingScanner = new Scanner(System.in);
        greeting = greetingScanner.nextLine();
        return greeting;
    }
}
