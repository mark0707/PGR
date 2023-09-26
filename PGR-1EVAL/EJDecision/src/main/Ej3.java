package main;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Introduce un numero para saber si es divisible entre 2,3 y 5");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("el numero es divisible de dos");
		} else if (numero % 3 == 0) {
			System.out.println("el numero es divisible de tres");
		} else if (numero % 3 == 0) {
			System.out.println("el numero es divisible de cinco");
		}

	}

}
