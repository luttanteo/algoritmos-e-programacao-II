package pilha;

public class Pilha {
    private String[] elementos;
    //índice do topo
    private int topo;
    private int capacidade;

    public Pilha(int quantidade) {
        this.capacidade = quantidade;
        this.elementos = new String[this.capacidade];
        this.topo = -1;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public String topo() {
        if(this.isEmpty()) {
            throw new RuntimeException("A pilha está vazia");
        }
        return this.elementos[this.topo];
    }

    public int size() {
        return this.capacidade;
    }

    public void push(String str) {
        if(this.topo == capacidade - 1) {
            throw new RuntimeException("A pilha está vazia");
        }

        this.elementos[++this.topo] = str;
    }

    public String pop() {
        if(this.isEmpty()) {
            throw new RuntimeException("A pilha está vazia");
        }
        // retorna o elemento do topo e decrementa o topo
        return this.elementos[this.topo--];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(int i = 0; i <= topo; i++) {
            builder.append(this.elementos[i]);
            if(i < this.topo) {
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
