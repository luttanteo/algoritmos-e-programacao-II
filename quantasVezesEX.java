import java.util.Random;
import java.util.Scanner;

public class quantasVezesEX {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int valor;
        int vetor[] = new int[10000];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rand.nextInt(0, 1000);
            
            }
            System.out.println("Digite o valor que deseja procurar");
            valor = sc.nextInt();
            System.out.printf("O valor foi encontrado %d vezes", buscar(vetor, valor));
        }
        
    public static int buscar(int[] array, int valor){
        int qtd = 0;
        for(int n : array){
            if(n==valor){
                qtd++;
            }

        }
        return qtd;
    }
    
}
