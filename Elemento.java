package fila;

public class Elemento<T> {
    private T valor;
    private Elemento<T> proximo;

    public Elemento(T valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public Elemento(T valor, Elemento<T> proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public T getValor() {
        return valor;
    }

    public void setProximo(Elemento<T> proximo) {
        this.proximo = proximo;
    }

    public Elemento<T> getProximo() {
        return proximo;
    }
}
