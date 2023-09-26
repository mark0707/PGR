package main;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int u;
		System.out.println("Introduce un numero para calcular los impares");

		u = sc.nextInt();

		
		
		for(int i=0;i<=u;i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		

		sc.close();

	}

}
