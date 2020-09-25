/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Model;
import view.View;

/**
 *
 * @author iker
 */
public class Controller {
    private View view;
    private Model model;
    
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }
    
    public void run(){
        view.showGreeting(model.getGreeting());
    }
}
