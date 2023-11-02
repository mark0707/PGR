package principal;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opc;

		do {
			menu();
			opc = sc.next().charAt(0);
			switch (opc) {
				case 'A':
					introducirNumero(sc);
					break;
				case 'B':
					asteriscos(sc);
					break;
				case 'C':
					numerosRepetidos(sc);
					break;
				case 'D':
					break;
				case 'E':
					break;
				case 'F':
					break;
				case 'G':
					break;
				case 'H':
					break;
				case 'I':
					break;
				case 'J':
					break;
				case 'K':
					break;
				default:
					System.out.println("Opcion no valida");
			}

		} while (opc != 'K' || opc != 'k');
	}

	private static void numerosRepetidos(Scanner sc) {
		int array[] = new int[10];
		int num;
		System.out.println("Introduce 10 numeros del 1 al 10");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce un numero");
			num = sc.nextInt();
		}
	}

	private static void asteriscos(Scanner sc) {
		int aster;
		char opc;
		int numIntro = 0;
		float media = 0;
		do {
			System.out.println("Introduce un numero y te mostrare los asteriscos");
			aster = sc.nextInt();
			if (aster < 0) {
				System.out.print("?");
			} else {
				media = media + aster;
				for (int i = 0; i < aster; i++) {
					System.out.print("*");
				}
				numIntro++;
			}

			System.out.println("\nQuieres seguir? s/n");
			opc = sc.next().charAt(0);
		} while (opc == 's' || opc == 'S');
		media = media / numIntro;
		System.out.println("Esta es la media de todos los numeros: " + media);
		System.out.println("Numeros introducidos: " + numIntro);
	}

	private static void introducirNumero(Scanner sc) {
		int[] arrayNum = new int[10];
		int[] arrayNumDoble = new int[10];
		String nombre;
		int num;

		System.out.println("Introduce tu nombre y al final te lo mostrare en mayuscula");
		nombre = sc.next();
		nombre = nombre.toUpperCase();
		System.out.println("Introduce 10 numeros entre el 10 y el 500");
		for (int i = 0; i < arrayNum.length; i++) {

			System.out.println("Introduce un numero");
			num = sc.nextInt();
			if (num > 10 && num < 500) {
				arrayNum[i] = num;
				arrayNumDoble[i] = num * 2;
			} else {
				i--;
			}
		}
		System.out.println(nombre);

		for (int i : arrayNum) {
			System.out.println("El numero es: " + i);
		}
		for (int i : arrayNumDoble) {
			System.out.println("El numero doble es: " + i);
		}

	}

	private static void menu() {
		System.out.println("\nIntroduzca una opcion de menu");
		System.out.println("Opcion A");
		System.out.println("Opcion B");
		System.out.println("Opcion C");
		System.out.println("Opcion D");
		System.out.println("Opcion E");
		System.out.println("Opcion F");
		System.out.println("Opcion G");
		System.out.println("Opcion H");
		System.out.println("Opcion I");
		System.out.println("Opcion J");
		System.out.println("K Salir");
	}

}
