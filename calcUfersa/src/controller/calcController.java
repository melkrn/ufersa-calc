package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class calcController {

    @FXML
    private Button buttonOK;

    @FXML
    private TextField displayField;

    @FXML
    void teste(ActionEvent event) {
      String displayText = displayField.getText();

      System.out.println("FOI");
      if (displayText.equals("movo")){
        System.out.println("DEU BOM");
      }else {
        System.out.println("AINDA NAO");
        System.out.println(displayText);
      }
    }

}

