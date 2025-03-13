import java.util.Scanner;
public class SomarEX {
    /* Crie um método recursivo que receba como parâmetro um número e retorne a soma
    de todos os números naturais de 1 até este número */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma, num;
        System.out.println("informe o número que deseja somar: ");
        num = sc.nextInt();
        soma = somaNatural(num);
        System.out.println("Soma: " + soma);
    }
    public static int somaNatural(int n) {
        if(n == 0) {
            return 0;
        }
        return n + somaNatural(n - 1);
    }
}
