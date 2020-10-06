/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Model;
import view.View;

/**
 * Class in which it is responsible for executing the methods of the interfaces.
 *
 * @author Iker
 */
public class Controller {

    private View view;
    private Model model;

    /**
     * It takes the interfaces and they are stored in the local variables.
     *
     * @param view
     * @param model
     */
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    /**
     * Execute the methods of the interfaces.
     */
    public void run() {
        view.showGreeting(model.getGreeting());
    }
}
