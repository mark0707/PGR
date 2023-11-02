package ejercicio;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		int parImpar;
		String nombre;
		int num = 0;

		do {
			System.out.println("Introduce el numero 1,2 o 3");
			System.out.println("1-Introduce un numero y te dice si es par o impar");
			System.out.println("2-Introduce tu nombre para mostrarlo");
			System.out.println("3-Repetir del 1 al 5 3 veces");
			System.out.println("4-Salir");
			numero = sc.nextInt();

			switch (numero) {
			case 1:

				System.out.println("Introduce un numero para calcular si el numero es par o impar");
				parImpar = sc.nextInt();
				if (parImpar % 2 == 0) {
					System.out.println("Par");
				} else {
					System.out.println("Impar");
				}

				break;
			case 2:
				System.out.println("Introduce tu nombre y te lo muestro");
				nombre = sc.next();
				System.out.println("Tu nombre es: " + nombre);
				break;
			case 3:
				for (int i = 1; i <= 3; i++) {
					System.out.println("\n" + i + ". Vuelta");
					do {
						num = num + 1;
						System.out.println(num);
					} while (num < 5);
					num = 0;

				}

				break;
			case 4:
				System.out.println("Saliste");
				break;
			default:
				System.out.println("Esto no es un numero apto");
			}

		} while (numero < 1 && numero > 4);

		sc.close();
	}

}
