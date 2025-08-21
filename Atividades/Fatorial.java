public class Fatorial {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
    public static int fatorial(int n) {
       return n <= 1 ? 1 : n * fatorial(n - 1);
        /*if (n <= 1) {
            return 1;
        }
        return n * fatorial(n - 1);*/
    }

}
