public class Array3EX {
    public static void main(String[] args) {
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "carro", "casa", "moto"};
        int posicao = buscar(letras, "casa");
                if (posicao >= 0){
                    System.out.printf("Encontrado na posição %d", posicao);
                } else {
                 System.out.println("Não encontrado!");
            }
    }
    public static int buscar(String[] array, String valor){
        int index = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(valor)){
                index = i;
                break;
            }
         }
        return index;
    }
 }
