import java.util.Random;
import java.util.Scanner;

public class BuscaCaractereEX {
    public static void main(String[] ars) {
        char[] array = new char[1000];
        preencher(array);
        Scanner sc = new Scanner(System.in);
        char valor;
        System.out.println("Informe o caractere a ser buscado");
        valor = sc.next().charAt(0); 
        System.out.printf("Encontrado na posição %d\n", buscarUltimaOcorrencia(array, valor));
    }

    public static void preencher(char[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) rand.nextInt(33, 127); 
        }
    }

    public static int buscarUltimaOcorrencia(char[] array, char valor) {
        // Começa a busca do final do array
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1; 
    }
}
