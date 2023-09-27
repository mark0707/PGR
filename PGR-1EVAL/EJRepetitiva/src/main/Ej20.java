package main;

import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int n;
		int suma = 0;
		System.out.println("Introduce un numero");
		n = sc.nextInt();
		do {

			suma = suma + n;
			n = n - 1;
		} while (n != 0);
		System.out.println(suma);
	}

}
