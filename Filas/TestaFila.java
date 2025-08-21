package fila;

import java.util.Random;

public class TestaFila {
    public static void main(String[] args) {
        Random rand = new Random();
        Fila minhaFila = new Fila(20);
        System.out.println("A fila estÃ¡ vazia? " + minhaFila.isEmpty());
        System.out.println("Capacidade da fila: " + minhaFila.length());
        try {
            // enfileirar
            for (int i = 0; i < 20; i++) {
                minhaFila.enqueue(rand.nextInt(100));
                System.out.println("Fila: "+minhaFila);
            }
            // desenfileirar
            for(int i = 0; i < 20; i++) {
                System.out.printf("Dequeue %d. Fila: %s%n", minhaFila.dequeue(), minhaFila);
            }
        } catch (Exception e) {
            System.out.println("Houve um erro: " + e.getMessage());
        }

    }
}
