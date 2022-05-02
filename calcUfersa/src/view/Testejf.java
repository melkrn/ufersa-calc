package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Testejf extends Application{

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

      Parent root = FXMLLoader.load(getClass().getResource("VE/calcLayout.fxml"));

      Scene cena = new Scene(root);
		
      primaryStage.setTitle("Calculadora UFERSA");
      primaryStage.setScene(cena);
      primaryStage.show();
             
    }
}

