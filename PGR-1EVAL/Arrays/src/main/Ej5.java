package main;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arrayNum = new int[17];
		int numMax = 0;
		String nombreAlum = null;
		int suma = 0;
		int opc = 0;
		int repetidos;
		int cont = 0;
		int clave;
		int claveAdmin;
		
		System.out.println("Introduce la clave de administrador");
		claveAdmin=sc.nextInt();
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println("Introduzca un entero");
			arrayNum[i] = sc.nextInt();

		}

		do {
			System.out.println("\nIntroduce una opcion");
			System.out.println("1. Mostrar");
			System.out.println("1. Mostrar");
			opc = sc.nextInt();
			switch (opc) {
				case 1:
					for (int i = 0; i < arrayNum.length; i++) {
						
						System.out.println("Numero: "+arrayNum[i]);

					}

					break;
				case 2:

					for (int i = 0; i < arrayNum.length; i++) {
						if (arrayNum[i] >= numMax) {
							numMax = arrayNum[i];
						}
						
					}
					System.out.println("El numero maximo es: " + numMax);
					
					break;
				case 3:
					
					for (int i = 0; i < arrayNum.length; i++) {
						suma = suma + arrayNum[i];
					}
					System.out.println("La suma de todos los numeros es: " + suma);
					break;
				case 4:
					System.out.println("Que numero quieres saber cuantas veces esta en la lista?");
					repetidos = sc.nextInt();
					for (int i = 0; i < arrayNum.length; i++) {
						if (repetidos == arrayNum[i]) {
							cont++;
						}

					}
					System.out.println("Ese numero aparece " + cont + " veces");
					break;
				case 5:
					cont=0;
					do {
						System.out.println("Introduce la clave");
						clave=sc.nextInt();
						if(clave==claveAdmin) {
							for(int i=0; i<arrayNum.length;i++) {
								arrayNum[i]=0;
							}
							System.out.println("Se cambio todos los numeros del array");
							cont=3;
						}
						cont++;
					}while(cont<3);
						
					break;
				case 6:
					for(int i=0; i<arrayNum.length; i++) {
						System.out.println(arrayNum[i]);
						
					}
					for(int i=0; i<arrayNum.length; i++) {
						System.out.println("Introducir nuevos  numeros");
						arrayNum[i]=sc.nextInt();
						
					}
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

	}

}
