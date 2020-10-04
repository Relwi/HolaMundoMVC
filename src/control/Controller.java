/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Model;
import view.View;

/**
 * Clase en la que se encarga de ejecutar los metodos de las interfaces.
 *
 * @author iker
 */
public class Controller {

    private View view;
    private Model model;

    /**
     * Coge las interfaces y se guardan en las variables locales.
     *
     * @param view
     * @param model
     */
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    /**
     * Ejecuta los metodos de las interfaces.
     */
    public void run() {
        view.showGreeting(model.getGreeting());
    }
}
