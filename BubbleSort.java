public class BubbleSort {
    public static void main(String[] args) {
       int[] numeros = {0, 104, 777, 2, 13, 1, 10, 87};
       ordenar(numeros);
       for(int i = 0; i < numeros.length; i++) {
           System.out.println(numeros[i] + "");
       }
    }
    public static void trocar(int[] v, int p1, int p2) {
        int temp = v[p1];
        v[p1] = v[p2];
        v[p2] = temp;
    }
    public static void ordenar(int[] vetor) {
        int trocas = 0;
        for(int i =0; i < vetor.length; i++) {
            boolean troca = false;
            for(int j = 0; j < vetor.length - 1 - i; j++) {
                if(vetor[j] > vetor[j + 1]) {
                    trocas++;
                    troca = true;
                    trocar(vetor, j, j + 1);
                }
            }
            if(!troca) {
                break;
            }
        }
        System.out.println("Número de trocas: " + trocas);
    }
}
