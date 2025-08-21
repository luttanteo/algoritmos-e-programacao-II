package aulaTres;

public class PotenciaRecursiva {
	public static void main(String[] args) {
		System.out.println(potencia(2, 3));
	}
	public static double potencia(double b, double e) {
		return e == 0 ? 1 : b * potencia(b, e - 1);
		/*
		if (e == 0) {
			return 1;
		}
		return b * potencia(b, e - 1);
		*/
	} 
}
