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
		int opcion = Funciones.dimeEntero("Dime una opcion", sc);
				
	switch (opcion) {
	case 1:
		int n1 = Funciones1.sumar(2, 3);
		System.out.println(n1);
		break;
	case 2:
		int n2 = Funciones1.restar(0, 0);
		break;
	case 3:
		Funciones2.multiplicar(0, 0);
		break;
	case 4:
		Funciones2.dividir(0, 0);
		break;
	case 5:
		Funciones1.esPar(0);
		break;
	case 6:
		Funciones1.esImpar(0);
		break;
	case 7:
		Funciones2.esPositivo(0);
		break;
	case 8:
		Funciones2.esNegativo(0);
		break;
	default:
		System.out.println("0. Salir");
		break;
		}
	}
}
