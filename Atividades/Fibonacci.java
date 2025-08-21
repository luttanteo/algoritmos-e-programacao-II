public class Fibonacci {
    public static int cont = 0;
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        System.out.println("O fibonacci desse número é " + fibonacci(40));
        System.out.println("Tempo em milissegundos: " + (System.currentTimeMillis() - inicio));
        System.out.println("Contador: " + cont);
    }
    public static int fibonacci(int n) {
        cont ++;
        return n==0 || n==1 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}
