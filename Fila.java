package fila;

public class Fila {
    private final int[] elementos;
    private final int capacidade;
    private int fim;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.fim = 0;
    }

    public Fila() {
        this(10);
    }

    public boolean isEmpty() {
        return this.fim == 0;
    }

    public int length() {
        return this.capacidade;
    }

    public int front() {
        if (!this.isEmpty()) {
            return this.elementos[0];
        }
        throw new RuntimeException("A fila estÃ¡ vazia");
    }

    public void enqueue(int elemento) {
        if (this.fim + 1 > this.capacidade) {
            throw new RuntimeException("A fila estÃ¡ cheia");
        }
        this.elementos[fim] = elemento;
        this.fim++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        // [10, 20, 30, 50]
        builder.append("[");
        for (int i = 0; i < this.fim; i++) {
            builder.append(this.elementos[i]);
            if (i != fim - 1) {
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    public int dequeue() {
        if (this.isEmpty()) {
            throw new RuntimeException("A fila estÃ¡ vazia");
        }
        int elemento = this.front();
        for (int i = 0; i < this.fim - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.fim--;
        return elemento;
    }
}
