package model.bo;
public class Box<T> {
    private T elements;
    private Box<T> next;

    

    
    public T getElements() {
        return elements;
    }

    
    public void setElements(T elements) {
        this.elements = elements;
    }

    
    public Box<T> getNext() {
        return next;
    }

    
    public void setNext(Box<T> next) {
        this.next = next;
    }

}
