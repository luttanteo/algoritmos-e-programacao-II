package fila;
import java.util.ArrayList;
import java.util.List;

public class FilaList {
    private final List<Integer> elementos;

    public FilaList() {
        elementos = new ArrayList<Integer>();
    }

    public boolean isEmpty() {
        return this.elementos.isEmpty();
    }

    public int length() {
        return this.elementos.size();
    }

    public int front() {
        if (!this.isEmpty()) {
            return this.elementos.get(0);
        }
        throw new RuntimeException("A fila está vazia");
    }

    public void enqueue(int elemento) {
        this.elementos.add(elemento);
    }

    @Override
    public String toString() {
        return this.elementos.toString();
    }

    public int dequeue() {
        if (this.isEmpty()) {
            throw new RuntimeException("A fila estÃ¡ vazia");
        }
        return this.elementos.remove(0);
    }
}
