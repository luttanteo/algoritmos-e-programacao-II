import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        double[] vetor = {7,8,3,5,9,10,11,4,2,0,1};
        System.out.println(Arrays.toString(vetor));
        insertionSort(vetor);
        System.out.println(Arrays.toString(vetor));
    }
    public static void insertionSort(double[] vetor) {
        int trocas = 0;
        for(int i = 1; i < vetor.length; i++) {
            int j = i - 1;
            double temp = vetor[i];
            while(j >= 0 && vetor[j] > temp) {
                vetor[j + 1] = vetor[j];
                vetor[j] = temp;
                j--;
                trocas++;
        }

       /* for(int i = 1; i < vetor.length; i++) {
            double temp = vetor[i]; // temp = temporário, variável temporária pra pinçar o nº escolhido
            for(int j = i - 1; j >= 0 && vetor[j] > temp; j--) { // j é o número da frente - 1
                vetor[j+1] = vetor[j]; //quem está na posição j+1 (tipo, 10) vai dar espaço pro j (9, exemplo)
                vetor[j] = temp;
                trocas++;
            } */
          
        }
        System.out.println("Trocas: " + trocas);
    }
}
