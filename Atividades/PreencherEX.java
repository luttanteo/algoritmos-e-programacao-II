import java.util.Random;

public class PreencherEX {
	public static void main(String[] args) {
		int[][][] matriz = new int[5][5][5];
		preencher(matriz);
		imprimir(matriz);
	}

	public static void preencher(int[][][] m) {
		Random rand = new Random();

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i][j].length; k++) {
					m[i][j][k] = rand.nextInt(100);
				}
			}
		}
	}

	public static void imprimir(int[][][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("%02d ", m[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
