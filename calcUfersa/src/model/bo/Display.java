package model.bo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Display {
  final static int maxNumbersDisplay = 13;
  public static void main(String[] args) { //TESTES
    System.out.println("@>SETDISPLAY");
  }

  public static void setNumberToDisplay(Button btn, TextField txt, String value){
    btn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event){
          if(txt.getLength() < maxNumbersDisplay) {
            txt.setText(txt.getText() + value);
          }
      }
    });
  }

  public static void clearDisplay(Button btn, TextField txt){
    btn.setOnAction(new EventHandler<ActionEvent>() {
    @Override
      public void handle(ActionEvent event){
        txt.clear();
    
      
    }
    });
  }

  public static void clearDisplay(TextField txt) {
    txt.clear();
  }

  public static void erase(Button btn, TextField txt) {
    btn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        if(txt.getLength() > 0) {
          String str = txt.getText();
          str = str.substring(0,str.length() - 1);
          txt.setText(str);
        }
      }
    });
  }
}
