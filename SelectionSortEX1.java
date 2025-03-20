import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class SelectionSortEX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linhas, colunas, menor, maior;

        System.out.println("Digite o número de linhas desejadas.");
        linhas = sc.nextInt();

        System.out.println("Digite o número de colunas desejadas.");
        colunas = sc.nextInt();

        System.out.println("Digite o menor valor possível desejado.");
        menor = sc.nextInt();

        System.out.println("Digite o maior valor possível desejado.");
        maior = sc.nextInt();

        int[] vetor = new int[linhas * colunas];
        aleatorio(vetor, menor, maior);
        System.out.println("Vetor Aleatório: " + Arrays.toString(vetor));
        selectionsort(vetor);
        System.out.println("Vetor Ordenado: " + Arrays.toString(vetor));
    }

    public static void selectionsort(int[] vetor) {
        int indiceMenor;
        for (int i = 0; i < vetor.length; i++) {
            indiceMenor = i; // i é o menor valor, o valor inicial.
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            if (i != indiceMenor) {
                trocar(vetor, i, indiceMenor);
            }
        }
    }

    public static void trocar(int[] vetor, int p1, int p2) {
        int auxiliar = vetor[p1]; // Variável auxiliar para "pinçar" o valor escolhido e comparar com o resto.
        vetor[p1] = vetor[p2];
        vetor[p2] = auxiliar;
    }

    public static void aleatorio(int[] vetor, int menor, int maior) {
        Random random = new Random();

        // Preenchendo o vetor com números aleatórios dentro do intervalo [menor, maior]
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(maior - menor + 1) + menor;
        }
    }
}
