package fila;
import java.util.ArrayList;
import java.util.List;

public class FilaPaciente {
    private final List<String> pacientes;
    private int capacidade;

    public FilaPaciente(int capacidade) {
        this.pacientes = new ArrayList<String>();
        this.capacidade = capacidade;
    }

    public boolean isEmpty() {
        return this.pacientes.isEmpty();
    }

    public int length() {
        return this.pacientes.size();
    }

    public String front() {
        if (!this.isEmpty()) {
            return this.pacientes.get(0);
        }
        throw new RuntimeException("A fila estÃ¡ vazia");
    }

    public void enqueue(String paciente) {
        if(this.length() == capacidade) {
            throw new RuntimeException("A fila está cheia");
        }
        this.pacientes.add(paciente);
    }

    @Override
    public String toString() {
        return this.pacientes.toString();
    }

    public String dequeue() {
        // caso a lista esteja vazia, dispara uma exception
        if (this.isEmpty()) {
            throw new RuntimeException("A fila está vazia");
        }
        return this.pacientes.remove(0);
    }

    public void redefinirTamanho(int novaCapacidade) {
        if(this.length() > novaCapacidade) {
            throw new RuntimeException("A nova capacidade nÃ£o pode ser inferior ao comprimento atual");
        }
        this.capacidade = novaCapacidade;
    }

}
