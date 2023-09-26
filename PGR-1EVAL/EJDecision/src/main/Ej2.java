package main;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("Introduce dos numeros enteros para decirte cual es mayor");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("El numero uno es mayor al numero dos");
		} else if (num2 > num1) {
			System.out.println("El numero dos es mayor al numeor uno");
		} else {
			System.out.println("los numeros son iguales");
		}

	}

}
