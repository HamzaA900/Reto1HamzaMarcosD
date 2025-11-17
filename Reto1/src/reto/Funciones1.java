package reto;

public class Funciones1 {
	/*Un alumno se encargará de las operaciones básicas (sumar, restar) y de los métodos de
	verificación de propiedades de números (esPar y esImpar).*/
	public static int sumar(int a, int b) {
		return a + b;
		
	}
	public static int restar(int a, int b) {
		return a - b;
		
	}
	public static boolean esPar(int n) {
		if (n%2==0) {
			return true;
		}else {
			return false;
		}
		
	}
	public static boolean esImpar(int n) {
		if (n%2!=0) {
			return true;
		}else {
			return false;
		}
		
	}

}
