package model.bo;
import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import model.vo.OperationsVO;
public class Operations<VO extends OperationsVO> {
  
  static OperationsVO op = new OperationsVO();
  public static void main(String[] args) { // TESTES
    System.out.println("@>SETOPERATIONS");
    String test = "2&2";
    System.out.println("@>>");
    System.out.println(isOperation("/"));
  
    
  }

  public static boolean isOperation(String value) { //Verifica se ocorre uma operacao
      boolean isOp = false;
      ArrayList<String> operators = new ArrayList<String>(){{
        add("+");
        add("-");
        add("x");
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

  public static Float eval(String expression){ // Realiza operacoes matematicas a partir de expressoes presentes em Strings

      ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
      try {
          // Avaliacao da expressao
          Object result = engine.eval(expression);
          return Float.valueOf(result.toString());
      }
      catch (ScriptException e) {
          System.out.println("Ops! .-.");
          e.printStackTrace();

          return Float.valueOf(0);
      }
  }
}
