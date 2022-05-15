package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.bo.Display;
import model.bo.Operations;
import model.vo.OperationsVO;

public class calcController {

  @FXML
  private Button btn0;

  @FXML
  private Button btn1;

  @FXML
  private Button btn2;

  @FXML
  private Button btn3;

  @FXML
  private Button btn4;

  @FXML
  private Button btn5;

  @FXML
  private Button btn6;

  @FXML
  private Button btn7;

  @FXML
  private Button btn8;

  @FXML
  private Button btn9;

  @FXML
  private Button btn_clear;

  @FXML
  private Button btn_div;

  @FXML
  private Button btn_equal;

  @FXML
  private Button btn_erase;

  @FXML
  private Button btn_function;

  @FXML
  private Button btn_mult;

  @FXML
  private Button btn_plusmin;

  @FXML
  private Button btn_point;

  @FXML
  private Button btn_porcentagem;

  @FXML
  private Button btn_soma;

  @FXML
  private Button btn_sub;

  @FXML
  private TextField displayField;

  public void initialize(){
    // Seta uma unica vez ao iniciar a calculadora
    /* --- EVENTOS DE BOTOES ------*/
    Display.setNumberToDisplay(btn0, displayField, "0");
    Display.setNumberToDisplay(btn1, displayField, "1");
    Display.setNumberToDisplay(btn2, displayField, "2");
    Display.setNumberToDisplay(btn3, displayField, "3");
    Display.setNumberToDisplay(btn4, displayField, "4");
    Display.setNumberToDisplay(btn5, displayField, "5");
    Display.setNumberToDisplay(btn6, displayField, "6");
    Display.setNumberToDisplay(btn7, displayField, "7");
    Display.setNumberToDisplay(btn8, displayField, "8");
    Display.setNumberToDisplay(btn9, displayField, "9");

    Display.setNumberToDisplay(btn_point, displayField, ".");
    Display.setNumberToDisplay(btn_soma, displayField, "+");
    Display.setNumberToDisplay(btn_sub, displayField, "-");
    Display.setNumberToDisplay(btn_mult, displayField, "x");
    Display.setNumberToDisplay(btn_div, displayField, "/");
    Display.setNumberToDisplay(btn_porcentagem, displayField, "%");
 /* --- END EVENTOS DE BOTOES ------*/
  }

  public void makeOperation(ActionEvent event){
    
    OperationsVO op = new OperationsVO();
    op.set_operation(displayField.getText());
    Boolean _isOperation = Operations.isOperation(String.valueOf(op.get_operation()));
    Display.clearDisplay(displayField);

    if(_isOperation){
      
      Float Result = Operations.eval(String.valueOf(op.get_operation()));
      System.out.println("EXECUTADO");
      displayField.setText(String.valueOf(Result));
    } else {
      System.out.println("LIMPO");
      Display.clearDisplay(displayField);
    }

  }

  public void clearDisplay(ActionEvent event){
    Display.clearDisplay(displayField);
  }
  
  public void clearLastPositionDisplay(ActionEvent event){
    String newDisplay = displayField.getText();
    newDisplay = newDisplay.substring(0, newDisplay.length() -1);
    displayField.setText(newDisplay);
  }

}

