public class PalindromoEX {
    public static void main(String[] args) {
        System.out.println(ehPalindromo("amor e roma"));
    }
    public static boolean ehPalindromo(String palavra) {
        if (palavra.length() <= 1) {
            return true;
        }
        if (palavra.charAt(0) != palavra.charAt(palavra.length() - 1)) {
            return false;
        }
        return ehPalindromo(palavra.substring(1, palavra.length() - 1));
    }
}
