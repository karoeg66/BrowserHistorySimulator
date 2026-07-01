import java.util.EmptyStackException;

public class Stack {
    Nodo top;
    int tamanio;

    public void push(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = top;
        top = nuevo;
        tamanio++;
    }

    public int pop() {
        if (tamanio == 0) {
            throw new EmptyStackException();
        }
        int valor = top.valor;
        top = top.siguiente;
        tamanio--;
        return valor;
    }

    public int peek() {
        if (tamanio == 0) {
            throw new  EmptyStackException();
        }
        return top.valor;
    }

    public int size(){
        return tamanio;
    }

    public boolean isEmpty(){
        if (tamanio == 0){
            return true;
        }
        return false;
    }

    public void printStack(){
        Nodo puntero = top;
        while(puntero != null){
            System.out.println(puntero.valor);
            puntero = puntero.siguiente;
        }
    }
}
