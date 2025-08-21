package aulaTres;

public class Recursivos {
	public static void main(String[] args) {
		System.out.println(recursivos(0));
		
	}
	public static int recursivos(int n) {
		return n == 0 ? 0 : n + recursivos(n-1);
		/*
		if (n == 0) {
			return 0;
		} else {
			return n + recursivos(n-1);
		} 
		*/
	}
}
