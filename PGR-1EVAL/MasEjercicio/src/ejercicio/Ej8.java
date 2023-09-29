package ejercicio;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nombre;
		String apellido;
		int opc;

		float peso;
		float altura;
		float imc;

		System.out.println("Introduce tu nombre");
		nombre = sc.next();

		System.out.println("Introduce tu apellido");
		apellido = sc.next();

		System.out.println("Bienvenido a nuestro programa: " + nombre + " " + apellido);

		do {
			System.out.println("1. Introducir peso");
			System.out.println("2. Salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:

				System.out.println("Introduce tu peso");
				peso = sc.nextFloat();
				System.out.println("Introduce tu altura");
				altura = sc.nextFloat();

				imc = peso / (altura * altura);
				System.out.println("Tu imc es: " + imc);

				break;
			case 2:
				System.out.println("Saliste");
				break;
			default:
				System.out.println("No es una opcion");

			}

		} while (opc != 2);

		sc.close();
	}

}
