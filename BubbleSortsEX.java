import java.util.Arrays;

public class BubbleSortsEX {
    public static void main(String[] args) {
        String[][] nomes = {{"Ana", "André", "João", "Carlos"},
                            {"Raul", "Wellington", "Maria", "Paulo"},
                            {"Cristian", "Almir", "Daniel", "Bruno"}};
        ordenar(nomes, 1);
        System.out.println(Arrays.toString(nomes[1]));
}
    public static void trocar(String[] v, int p1, int p2) {
        String temp = v[p1];
        v[p1] = v[p2];
        v[p2] = temp;
    }
    public static void ordenar(String[][] matriz, int linha) {
     int trocas = 0;
        for(int i = 0; i < matriz[linha].length; i++) {
            boolean troca = false;
        for(int j = 0; j < matriz[linha].length; j++) {
            if(matriz[linha][j].compareTo(matriz[linha][j + 1]) < 0 ) {
                trocas++;
                troca = true;
                trocar(matriz[linha], j, j + 1);
            }
        }
        if(!troca) {
            break;
        }
    }
        System.out.println("Número de trocas: " + trocas);
    }
}

