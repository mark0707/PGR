package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nombre = new String[50];
		int[] precio = new int[50];
		char opc = 'o';

		do {
			switch (opc) {
			case 1:
			anadirArticulo(sc, precio, nombre);
				break;
			case 2:
				break;

			case 3:
				break;
			default:

			}

		} while (opc == 's' || opc == 'S');

	}

	private static void anadirArticulo(Scanner sc,int[] precio, String[] nombre ) {
		String nomArt;
		int precArt;

		for(int i=0;i < nombre.length;i++) {
			System.out.println("Introduce un articulo");
			nomArt=sc.next();
			System.out.println("Introduce el precio del articulo");
			precArt=sc.nextInt();

			nombre[i]=nomArt;
			precio[i]=precArt;
			
		}
	}

}
