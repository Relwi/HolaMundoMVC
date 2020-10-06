/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import view.JavaFXViewImplementation;
import view.View;
import view.ViewFactory;

/**
 *
 * @author iker
 */
public class ViewJUnitTest {

    ViewFactory viewFactory = new ViewFactory();

    public ViewJUnitTest() {
    }

    @Test
    public void ViewTest() {
        View view = this.viewFactory.getView();
        assertEquals(view, view);
    }
}
