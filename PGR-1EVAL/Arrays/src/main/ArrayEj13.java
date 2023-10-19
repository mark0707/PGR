package main;

import java.util.Scanner;

public class ArrayEj13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arrayAlum = new String[3];
		int[] arraynota = new int[3];
		int notaMax = 0;
		String nombreAlum = null;
		int suma = 0;
		int opc = 0;
		int repetidos = 0;
		

		for (int i = 0; i < arrayAlum.length; i++) {
			System.out.println("Introduce el nombre de un alumno");
			arrayAlum[i] = sc.next();

			System.out.println("Introduzca su nota");
			arraynota[i] = sc.nextInt();

		}

		do {
			System.out.println("\nIntroduce una opcion");
			System.out.println("1. Mostrar todo");
			System.out.println("2. Mostrar nota maxima");
			System.out.println("3. Calcular la media de las notas");
			System.out.println("4. Mostrar cantidad de notas repetidas");
			System.out.println("5. Mostrar la nota de un alumno especifico");
			System.out.println("6. Cambiar la nota de un alumno");

			opc = sc.nextInt();
			switch (opc) {
				case 1:
					visualizarTodo(arrayAlum, arraynota);
					break;
				case 2:
					notaMaxima(arrayAlum, arraynota, nombreAlum, notaMax);
					break;
				case 3:
					calcularMedia(arrayAlum, arraynota, suma);
					break;
				case 4:
					repeticionNum(arrayAlum, sc, arraynota, repetidos);
					break;
				case 5:
					notaAlumno(sc, arrayAlum, nombreAlum, arraynota);
					break;
				case 6:
					cambiarNota(sc, arrayAlum, nombreAlum, arraynota);
					break;
				case 7:

					break;
				case 8:
					System.out.println("Saliste");
					break;
				default:
					System.out.println("Opcion no valida");
			}

		} while (opc != 8);
		sc.close();
	}

	private static void cambiarNota(Scanner sc, String[] arrayAlum, String nombreAlum, int[] arraynota) {
		for (int i = 0; i < arrayAlum.length; i++) {
			System.out.println(arrayAlum[i]);
		}
		System.out.println("De que persona quieres cambiar la nota");
		nombreAlum = sc.next();
		for (int i = 0; i < arrayAlum.length; i++) {
			if (nombreAlum .equalsIgnoreCase(arrayAlum[i])) {
				System.out.println("Que nota quieres poner a " + nombreAlum);
				arraynota[i] = sc.nextInt();
			}
		}
		System.out.println("Nota cambiada con exito");
	
	}

	private static void notaAlumno(Scanner sc, String[] arrayAlum, String nombreAlum, int[] arraynota) {
		boolean encontrado = false;

		do {
			System.out.println("De que alumno quieres sacar la nota");
			nombreAlum = sc.next();
			for (int i = 0; i < arrayAlum.length; i++) {
				if (nombreAlum.equalsIgnoreCase(arrayAlum[i])) {
					System.out.println("La nota del alumno es un " + arraynota[i]);
					encontrado = true;
				}
			}
		} while (!encontrado);

	
	}

	private static void repeticionNum(String[] arrayAlum, Scanner sc, int[] arraynota, int repetidos) {
		int cont = 0;
		System.out.println("Que numero quieres saber cuantas veces esta en la lista?");
		repetidos = sc.nextInt();
		for (int i = 0; i < arrayAlum.length; i++) {
			if (repetidos == arraynota[i]) {
				cont++;
			}

		}
		System.out.println("Ese numero aparece " + cont + " veces");
	}

	private static void calcularMedia(String[] arrayAlum, int[] arraynota, int suma) {
		int media;
		for (media = 0; media < arrayAlum.length; media++) {
			suma = suma + arraynota[media];
		}
		suma = suma / media;
		System.out.println("La media de todas las notas es: " + suma);
	}

	private static void notaMaxima(String[] arrayAlum, int[] arraynota, String nombreAlum, int notaMax) {
		nombreAlum = null;
		for (int i = 0; i < arrayAlum.length; i++) {
			if (arraynota[i] >= notaMax) {
				notaMax = arraynota[i];
				nombreAlum = arrayAlum[i];
			}
		}
		System.out.println("El alumno con mas nota es: " + nombreAlum+"su nota es un "+notaMax);
		// convertimos el nombre del alumno a null ya que el la opcion 5, 6 usamos esta
		// variable y puede coincidir con el 1. nombre del array sin haberle preguntado
		// al usuario
		
	}

	private static void visualizarTodo(String[] arrayAlum, int[] arraynota) {
		for (int i = 0; i < arrayAlum.length; i++) {
			System.out.println("\nNombre del alumno");
			System.out.println(arrayAlum[i]);
			System.out.println("Nota del alumno");
			System.out.println(arraynota[i]);

		}
	}

}
