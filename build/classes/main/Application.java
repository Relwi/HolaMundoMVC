/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.ModelFactory;
import view.ViewFactory;
import control.Controller;
import view.View;
import model.Model;

/**
 *
 * @author Iker
 */
public class Application {

    /**
     * Main method, we create the factory classes of the model and view and we
     * take the values that we have assigned to each class, model (file or DB)
     * and view (console or graph). We create the controller with the interfaces
     * and execute the controller.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelFactory modelFactory = new ModelFactory();
        ViewFactory viewFactory = new ViewFactory();
        Model model = modelFactory.getModel();
        View view = viewFactory.getView();

        Controller controller = new Controller(view, model);
        controller.run();
    }
}
