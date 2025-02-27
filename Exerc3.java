package aulaTres;

import java.util.Arrays;

public class Exerc3 {

	    public static void main(String[] args) {
	        // Array de 50 palavras ordenadas alfabeticamente
	        String[] palavras = {
	            "abacaxi", "abajur", "abaixo", "abismo", "aberta", "abissal", "acabado", "acelera", "acerto", "acima", 
	            "adicionar", "adivinha", "adolescente", "adversário", "aeronauta", "afeto", "agente", "agilidade", "agora", "alegria", 
	            "alface", "alfabeto", "algoritmo", "alívio", "amável", "análise", "anatomia", "andar", "anunciar", "aparente", 
	            "apetite", "aplicativo", "arco", "argumento", "artigo", "assassino", "atento", "audição", "autonomia", "avançar", 
	            "balança", "banco", "barragem", "batalha", "bexiga", "biblioteca", "biscoito", "bloco", "boca", "bomba"
	       };
	        Arrays.sort(palavras);
	       // System.out.println("abacaxi".compareTo("arco"));
	  }
	    	public static int buscaBinaria(String[] array, String palavra) {
				int ini, fim, meio;
				ini = 0;
				fim = array.length -1;
				while(ini <= fim) {
					meio = (ini + fim) / 2;
					if(array[meio].compareTo(palavra) > 0) {
						fim = meio - 1;
					} else if(array[meio].compareTo(palavra) > 0) {
						ini = meio + 1;
					} else {
						return meio;
					}
				}
				return -1;
			}
}
