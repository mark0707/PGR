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
			System.out.println("1. Calcular IMC");
			System.out.println("2. Salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				do {
					System.out.println("Introduce tu peso");
					peso = sc.nextFloat();
					System.out.println("Introduce tu altura en cm (con coma)");
					altura = sc.nextFloat();
					if (peso < 0 && altura < 0) {
						System.out.println("Peso o altura erroneo");
					}
				} while (peso < 0 && altura < 0);

				imc = peso / (altura * altura);
				System.out.printf("Tu imc es: " + "%.2f",imc );
				
				if(imc<18) {
					System.out.println("Delgadez Preocupante");
				}else if(imc>=18 && imc<=25) {
					System.out.println("Peso adecuado");
				}else {
					System.out.println("Sobrepeso");
				}
				
				
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
