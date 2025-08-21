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
        // caso não exista o primeiro (fila vazia)
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
        // aumenta o tamanho
        this.tamanho++;
    }

    public Elemento<T> dequeue() {
        //caso a fila esteja vazia desde o começo
        if(this.isEmpty()) {
            throw new RuntimeException("A fila está vazia");
        }
        Elemento<T> saiuDaFila = this.primeiro;
        this.primeiro = this.primeiro.getProximo();
        this.tamanho--;
        //caso a lista esvazie-se, define primeiro e último como null
        if(this.tamanho == 0) {
            this.primeiro = null;
            this.ultimo = null;
        }
        // retorna o elemento que foi desenfileirado
        return saiuDaFila;
    }
}
