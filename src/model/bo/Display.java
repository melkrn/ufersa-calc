package model.bo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.vo.OperationsVO;

public class Display {
  public static void main(String[] args) { //TESTES
    System.out.println("@>SETDISPLAY");
  }


  public static void setNumberToDisplay(Button btn, TextField txt, String value){
    
    btn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event){
          txt.setText(txt.getText() + value);
        
          
      }
    });
  }

  public static void clearDisplay(TextField txt){
    txt.clear();
  }
}
