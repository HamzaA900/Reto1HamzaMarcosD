package reto;

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		
		/*
		 * El programa debe mostrar un menú para que el usuario elija la operación que
		 * desea realizar, si se introduce cualquier otro número debe indicar opción
		 * incorrecta y mostrar el menú. Después de realizar la operación debe volver a
		 * aparecer el menú.
		 */
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Menu: ");
		int opcion = 0;
			
		do {
			opcion = Funciones.dimeEntero("Dime una opcion", sc);
			switch (opcion) {
			case 1:
			int n1 = Funciones1.sumar(2, 3);
			System.out.println(n1);
			break;
		case 2:
			int n2 = Funciones1.restar(8, 4);
			System.out.println(n2);
			break;
		case 3:
			int n3 = Funciones2.multiplicar(2, 9);
			System.out.println(n3);
			break;
		case 4:
			int n4 = Funciones2.dividir(8, 2);
			System.out.println(n4);
			break;
		case 5:
			boolean n5 = Funciones1.esPar(1);
			System.out.println(n5);
			break;
		case 6:
			boolean n6 = Funciones1.esImpar(3);
			System.out.println(n6);
			break;
		case 7:
			boolean n7 = Funciones2.esPositivo(0);
			System.out.println(n7);
			break;
		case 8:
			boolean n8 = Funciones2.esNegativo(0);
			System.out.println(n8);
			break;
		default:
			System.out.println("Para salir pon 0: ");
			break;
			}
		} while (opcion != 0);
		System.out.println("Salir");
	}
}
