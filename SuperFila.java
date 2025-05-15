package fila;

public class SuperFila<T> {
    private Elemento<T> primeiro = null;
    private Elemento<T> ultimo = null;
    private int tamanho = 0;

    public Elemento<T> front() {
        return this.primeiro;
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public int length() {
        return this.tamanho;
    }

    public void enqueue(T valor) {
        if (this.primeiro == null) {
            this.primeiro = new Elemento<T>(valor);
        } else if (this.ultimo == null) {
            this.ultimo = new Elemento<T>(valor);
            this.primeiro.setProximo(this.ultimo);
        } else {
            Elemento<T> e = new Elemento<T>(valor);
            this.ultimo.setProximo(e);
            this.ultimo = e;
        }
        this.tamanho++;
    }
}
