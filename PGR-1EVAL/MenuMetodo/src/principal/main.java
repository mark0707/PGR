package principal;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opc;
		int[] arrayNum = new int[10];


		menu();
		opc = sc.next().charAt(0);
		do {
			switch (opc) {
				case 'A':
					introducirNumero(sc, arrayNum);
					break;
				case 'B':

					break;
				case 'C':
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

	private static void introducirNumero(Scanner sc, int[]arrayNum) {
		int[] arrayNumDoble = new int[10];
		String nombre;
		int num;

		System.out.println("Introduce tu nombre y al final te lo mostrare en mayuscula");
		nombre=sc.next();
		nombre=nombre.toUpperCase();
		System.out.println("Introduce 10 numeros entre el 10 y el 500");
		for (int i=0; i<arrayNum.length;i++) {

			System.out.println("Introduce un numero");
			num=sc.nextInt();
			if(num>10 && num<500){
				arrayNum[i]=num;
				arrayNumDoble[i]=num*2;
			}else{
				i--;		
			}
		}
		System.out.println(nombre);
		
		for (int i : arrayNum) {
			System.out.println("El numero es: "+i);
		}
		for (int i : arrayNumDoble) {
			System.out.println("El numero doble es: "+i);
		}


	}

	private static void menu() {
		System.out.println("Introduazca una opcion de menu");
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
