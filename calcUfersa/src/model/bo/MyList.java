package model.bo;

public class MyList<T> {
    private Box<T> startPoint;


    public MyList(){
        this.startPoint = null;
    }
    public void insert(T item){
        // Criando nova box para armazenar elemento
        Box<T> caixa = new Box<>();
        caixa.setElements(item); //Inserido item na box
        caixa.setNext(null); // prox espaço será vazio

        if(startPoint == null) {
            startPoint = caixa;
        } else {
            Box<T> aux = startPoint;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(caixa);
        }
    }

    public T remove(){
        Box<T> aux = startPoint;
        T e = aux.getElements();

        startPoint = aux.getNext();
        return e;
    }

    public void list(){
        if(startPoint == null){
            System.out.println("The list is empty, bro .-.");
        } else {
            Box<T> aux = startPoint;
            while( aux != null){
                System.out.println("Item: " + aux.getElements());
                aux = aux.getNext();
            }
        }
    }

    public boolean isEmpty(){
        return (this.startPoint == null);
    }
}
