package main;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nombre;
		int numHijos;
		float sueldoPer;
		String estadoCivil;
		char letra;

		do {

			System.out.println("Introduce tu nombre");
			nombre = sc.next();
			System.out.println("Introduce el sueldo del trabajador");
			sueldoPer = sc.nextFloat();
			System.out.println("Introduce el estado civil. soltero/casado/viudo/otro");
			estadoCivil = sc.next();

			if (estadoCivil.equalsIgnoreCase("soltero")) {
				sueldoPer = sueldoPer * 0.87f;
			} else if (estadoCivil.equalsIgnoreCase("casado")) {
				sueldoPer = sueldoPer * 0.92f;
			} else if (estadoCivil.equalsIgnoreCase("viudo")) {
				sueldoPer = sueldoPer * 0.99f;
			} else if (estadoCivil.equalsIgnoreCase("otro")) {
				sueldoPer = sueldoPer * 0.89f;
			}

			if (sueldoPer <= 1000) {
				System.out.println("Introduce el numero de hijos");
				numHijos = sc.nextInt();
				if (numHijos >= 1) {
					System.out.println("SR." + nombre + "Beca concedida");
				} else {
					System.out.println("No se te ha concedido la beca");
				}
			} else {
				System.out.println("No se te ha concedido la beca");
			}

			System.out.println("Deseas introducir nuevos datos? pulse s para repetir0");
			letra = sc.next().charAt(0);
		} while (letra == 's' || letra == 'S');

	}

}
