/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Model;
import model.ModelFactory;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iker
 */
public class ModelJUnitTest {

    ModelFactory modelFactory = new ModelFactory();

    public ModelJUnitTest() {
    }

    /**
     * Test of getGreeting method, of class Model.
     */
    @Test
    public void GreetingTest() {
        Model model = this.modelFactory.getModel();
        assertEquals("Hola Mundo", model.getGreeting());
    }

}
