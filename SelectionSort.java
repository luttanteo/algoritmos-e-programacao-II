import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] v = {5, 8, 1, 50, 333, 10, 2, 12, 0};
        System.out.println(Arrays.toString(v));
        selectionsort(v);
        System.out.println(Arrays.toString(v));
    }

    public static void selectionsort(int[] vetor) {
        int indiceMenor;
        for(int i = 0; i < vetor.length; i++) {
            indiceMenor = i; // i é o menor valor, o valor inicial.
            for(int j = i + 1; j < vetor.length; j++) {
                if(vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j; // guarda na variavel indiceMenor a posicao do menor valor
                }
            }
            // só faz a troca caso tenha um valor menor do que o da posição indiceMenor.
            if(i != indiceMenor) {
              trocar(vetor, i, indiceMenor);
          }
        }
    }

    public static void trocar(int[] vetor, int p1, int p2) {
        int auxiliar = vetor[p1]; // variavel auxiliar para "pinçar" o valor escolhido e comparar com o resto.
        vetor[p1] = vetor[p2];
        vetor[p2] = auxiliar;
    }
}
