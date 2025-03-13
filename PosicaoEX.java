public class PosicaoEX {
	public static void main(String[] args) {
		int[][] matriz =	{{1, 2, 3}, 
							{5, 6, 7}, 
							{9, 10, 11}};
		int valorInteiro = 10;
		int[] vetor = buscar(matriz, valorInteiro);
		System.out.printf("Encontrado na posição [%d,%d]", vetor[0], vetor[1]);
		
	}
	
	public static int[] buscar(int[][] matriz, int valor) {
		int[] coord = {-1, -1};
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == valor) {
					coord[0] = i;
					coord[1] = j;
							break;
				}
			}
		}
		
		return coord;
	}
}
