package model.bo;
import java.util.ArrayList;

import model.vo.OperationsVO;
public class Operations<VO extends OperationsVO> {
  
  public static void main(String[] args) { // TESTES
    System.out.println("@>SETOPERATIONS");
    String test = "2&2";
    System.out.println("@>>" + isOperation(test));
  }

  public static boolean isOperation(String value) { //Verifica se ocorre uma operacao
    boolean isOp = false;
    ArrayList<String> operators = new ArrayList<String>(){{
      add("+");
      add("-");
      add("*");
      add("%");
      add("/");
    }};
    
     for (String op : operators){
       if(value.indexOf(op) > -1){
        isOp = true;
       }
     }
    System.out.println(operators);
    return isOp;
  }
}
