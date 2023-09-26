package main;

import java.util.Scanner;

public class Ej30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 0;
		int u;
		int suma = 0;
		do {
			System.out.println("introduzca 10 numeros");
			u = sc.nextInt();
			if (u < 0) {
				u=0;
			}
			suma = suma + u;

			i++;
		} while (i < 10);
		System.out.println(suma);
		sc.close();
	}

}
