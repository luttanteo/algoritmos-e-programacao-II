public class BuscaBinariaRecursiva {
    public static void main(String[] args) {
    int numeros[] = {1,2,3,4,5,6,7,8,9,10};
    int posicao = buscaBinariaRecursiva(numeros, 9, 0, numeros.length - 1);
    System.out.println("Posição: " + posicao);
    }
    public static int buscaBinariaRecursiva(int[] array, int valor, int ini, int fim) {
        int meio;
        if(ini > fim) {
            return -1;
        }
        meio = (ini + fim) / 2;
        if(array[meio] > valor) {
            return buscaBinariaRecursiva(array, valor, ini, meio - 1);
        } else if (array[meio] < valor) {
            return buscaBinariaRecursiva(array, valor, meio + 1, fim);
        } else {
            return meio;
        }
    }
}
