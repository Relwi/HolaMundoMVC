/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * View implementation to show greeting in a text type UI.
 *
 * @author aketza
 */
public class ViewImplementation implements View {

    /**
     * Show a greeting in UI.
     *
     * @param greeting A String containing the greeting to be shown.
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
}
