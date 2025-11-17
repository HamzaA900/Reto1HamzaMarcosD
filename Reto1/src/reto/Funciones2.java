package reto;

public class Funciones2 {
	
	/*
	 * El otro alumno se encargará de las operaciones (multiplicar, dividir) y de
	 * los métodos (esPositivo y esNegativo).
	 */
	public static int multiplicar(int a, int b) {
		return a * b;	
	}
	public static int dividir(int c, int d) {
		return c / d;
	}
	
	public static boolean esPositivo (int numero) {
		if (numero >= 0) {
			return true;
		} else {
			return false;
	}
}
	public static boolean esNegativo (int num) {
		if (num <= 0) {
			return true;
		} else {
			return false;
		}	
	}
}
