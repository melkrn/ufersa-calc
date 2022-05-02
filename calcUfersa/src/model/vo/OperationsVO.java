package model.vo;
import java.util.*;
public class OperationsVO {
  private String _lastOperator;
  private String _lastNumber;
  private List<String> _operation;


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
  public List<String> get_operation() {
    return _operation;
  }
  public void set_operation(List<String> _operation) {
    this._operation = _operation;
  }

}
