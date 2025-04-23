import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prova {
   /*
   * Integrantes: Ana Luiza Alves de Lima
   *              Leonardo Lopes Ribeiro
   * */
   public static void main(String[] args) {
       int menu = 0;
       int linhas;
       boolean matrizExist = false;
       int[][] matriz = null;

       Scanner scanner = new Scanner(System.in);
       while (menu != 9){
          System.out.println("Digite o que você quer fazer: ");
           System.out.println("1 - Criar a matriz");
           System.out.println("2 - Ordenar a diagonal principal");
           System.out.println("3 - Ordenar a diagonal secundaria");
           System.out.println("4 - Buscar um valor na diagonal principal");
           System.out.println("5 - Buscar um valor em uma linha especifica");
           System.out.println("6 - Buscar um valor em uma coluna específica");
           System.out.println("7 - Exibir a matriz");
           System.out.println("8 - Resetar a matriz");
           System.out.println("9 - Sair");
           menu = scanner.nextInt();

           if (menu == 1) {
               System.out.println("Digite o número de linhas e colunas da matriz:");
               linhas = scanner.nextInt();
               if (linhas < 2) {
                   System.out.println("A matriz deve ser quadrática e possuir pelo menos 2 dimensões.");
               } else {
                   matriz = new int[linhas][linhas];
                   create(matriz);
                   matrizExist = true;
                   exibirMatriz(matriz);
               }
           } else if (menu != 9 && !matrizExist) {
               System.out.println("Para usar as funcionalidades, a matriz precisa existir");
           } else if (matrizExist) {
               switch (menu) {
                   case 2:
                       diagonalPrincipal(matriz);
                       exibirMatriz(matriz);
                       break;
                   case 3:
                       diagonalSecundaria(matriz);
                       exibirMatriz(matriz);
                       break;
                   case 4:
                       System.out.println("Digite o valor para buscar na diagonal principal:");
                       int valorPrincipal = scanner.nextInt();
                       int posic = buscarDiagonal(valorPrincipal, matriz);
                       System.out.println("O valor esta na linha " + posic + " e na coluna " + posic);
                       break;
                   case 5:
                       System.out.println("Digite o valor para buscar:");
                       int valor = scanner.nextInt();
                       System.out.println("Digite a linha para buscar o valor:");
                       int linha = scanner.nextInt();
                       int posi = buscaLinha(valor, matriz,linha);
                       System.out.println("O valor esta na linha " + linha + " e na posição " + posi);
                       break;
                   case 6:
                       System.out.println("Digite o numero para buscar:");
                       int numero = scanner.nextInt();
                       System.out.println("Digite a coluna para buscar o valor:");
                       int coluna = scanner.nextInt();
                       int position = buscaColuna(numero, matriz,coluna);
                       System.out.println("O valor esta na coluna " + coluna + " e na posição " + position);
                       break;
                   case 7:
                       exibirMatriz(matriz);
                       break;
                   case 8:
                       matriz = null;
                       matrizExist = false;
                       System.out.println("A matriz foi resetada.");
                       break;
                   case 9: break;
                   default:
                       System.out.println("Digite uma opção válida.");
                       break;
               }
           }
       }
   }

   public static void create(int[][] matriz){
       Random random = new Random();
           for(int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz[i].length; j++) {
                 matriz[i][j] = random.nextInt(100);
          }
       }

   }

   public static void diagonalPrincipal(int[][] matriz){
       quickSort(matriz, 0, matriz[0].length - 1);
   }

   public static void quickSort(int[][] matriz, int left, int right){
       if(left < right){
           int pivo = partition(matriz, left, right);
           quickSort(matriz, left, pivo - 1);
           quickSort(matriz, pivo + 1, right);
       }
   }

   public static int partition(int[][] matriz, int left, int right){
       int pivo = matriz[right][right];
       int i = left - 1;
       for(int j = left; j < right; j++) {
           if (matriz[j][j] <= pivo) {
               i++;
               int temporaria = matriz[i][i];
               matriz[i][i] = matriz[j][j];
               matriz[j][j] = temporaria;
           }
       }
       int temporaria = matriz[i + 1][i + 1];
       matriz[i + 1][i + 1] = matriz[right][right];
       matriz[right][right] = temporaria;
       return i+1;
   }

   public static void diagonalSecundaria(int[][] matriz){
       insertionSort(matriz, matriz[0].length -1);
   }

   public static void insertionSort(int[][] matriz, int right) {
       int trocas = 0;
       int n = matriz.length;

       // Aplica o Insertion Sort diretamente na diagonal secundária
       for (int i = 1; i < n; i++) {
           int temp = matriz[i][n - 1 - i];
           int j = i - 1;

           while (j >= 0 && matriz[j][n - 1 - j] > temp) {
               matriz[j + 1][n - 1 - (j + 1)] = matriz[j][n - 1 - j];
               matriz[j][n - 1 - j] = temp;
               j--;
               trocas++;
           }
           System.out.println(trocas);
       }
   }

   public static void exibirMatriz(int[][] matriz) {
       System.out.println("Matriz:");
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               System.out.printf("%4d", matriz[i][j]);
           }
           System.out.println();
       }
   }

   public static int buscaLinha(int num, int[][] matriz, int linha) {
       int posicao = -1;
       for (int i = 0; i < matriz[0].length; i++) {
           if (matriz[linha][i] == num) {
               posicao = i;
               break;
           }
       }
       return posicao;
   }
   public static int buscaColuna(int num, int[][] matriz, int coluna) {
       int posicao = -1;
       for (int i = 0; i < matriz[0].length; i++) {
           if (matriz[i][coluna] == num) {
               posicao = i;
               break;
           }
       }
       return posicao;
   }
   public static int buscarDiagonal(int num, int[][] matriz){
       int posicao = -1;
       for (int i = 0; i < matriz[0].length; i++) {
           if (matriz[i][i] == num) {
               posicao = i;
               break;
           }
       }
       return posicao;
   }
}
