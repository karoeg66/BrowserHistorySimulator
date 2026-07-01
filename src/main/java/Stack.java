import java.util.EmptyStackException;

public class Stack {
    Nodo top;
    int tamanio;

    public void push(String url) {
        Nodo nuevo = new Nodo(url);
        nuevo.siguiente = top;
        top = nuevo;
        tamanio++;
    }

    public String pop() throws Exception {
        if (top == null) {
            throw new Exception("No pages in history to go back to.");
        }
        String url = top.url;
        top = top.siguiente;
        tamanio--;
        return url;
    }

    public String peek() throws Exception {
        if (tamanio == 0) {
            throw new Exception("No pages in history to go back to.");
        }
        return top.url;
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
            System.out.println(puntero.url);
            puntero = puntero.siguiente;
        }
    }
}
