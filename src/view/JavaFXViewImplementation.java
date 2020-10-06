/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Aketza
 */
public class JavaFXViewImplementation extends Application implements View {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hola Mundo GUI");
        Text text = new Text();
        text.setText("");
        Scene scene = new Scene(new VBox(text), 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void showGreeting(String greeting) {
        launch();
    }
}
