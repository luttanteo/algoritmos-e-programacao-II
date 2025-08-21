public class BBinariaEX {
	public static void main(String[] args) {
		int [][] array = new int[10][10];
		int valor = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = valor++;

			}
		}
		
		int[] coord = buscaBinaria(array, 0);
		System.out.println(coord[0]);
		System.out.println(coord[1]);
	}
	public static int[] buscaBinaria(int[][] array, int valor) {
		int[] coord = {-1, -1};
		int ini, meio, fim;
		for(int linha = 0; linha < array.length; linha++) {
			fim = array[linha].length - 1;
			if(array[linha][fim] < valor) {
				continue; // enquanto o break encerra o loop, o continue encerra a consequência até as condições baterem
			}
			ini = 0;
			while(ini <= fim) {
				meio = (ini + fim) / 2;
				if(array[linha][meio] > valor) {
					fim = meio - 1;
				} else if(array[linha][meio] < valor) {
					ini = meio + 1;
				} else {
					return new int[] {linha, meio};
				}
			}
		
		}
		return coord;
	
	}
}
