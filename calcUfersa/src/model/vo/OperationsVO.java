package model.vo;
public class OperationsVO {
  private String _lastOperator = "";
  private String _lastNumber = "";
  private char[] _operation;


  public String get_lastOperator() {
    return _lastOperator;
  }
  public void set_lastOperator(String _lastOperator) {
    this._lastOperator = _lastOperator;
  }
  public String get_lastNumber() {
    return _lastNumber;
  }
  public void set_lastNumber(String _lastNumber) {
    this._lastNumber = _lastNumber;
  }
  public char[] get_operation() {
    return _operation;
  }
  public void set_operation(String _operation) {

    char [] caracteres = new char[_operation.length()];
    int count = 0;
    for (char letra : _operation.toCharArray()) {
      caracteres[count] = letra;
      count++;
    }
    System.out.println(caracteres[0]);
    this._operation = caracteres;
  }

}
