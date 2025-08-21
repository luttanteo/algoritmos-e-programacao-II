package pilha;

public class TestaPilha {
    public static void main(String[] args) {
        Pilha sites = new Pilha(10);
        sites.push("https://www.globo.com");
        sites.push("https://www.uol.com.br");
        sites.push("https://www.google.com");
        System.out.println(sites);
        sites.pop();
        System.out.println(sites);
        sites.push("https://www.sp.senac.br");
    }
}
