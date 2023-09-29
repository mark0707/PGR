package main;

import java.util.Scanner;

public class Ej32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroP;
		int numeroG;
		int cambio;
		
		do {
			System.out.println("Introduce el numero pequeño");
			numeroP = sc.nextInt();
			System.out.println("Introduce el numero grande");
			numeroG = sc.nextInt();
			if(numeroP == numeroG) {
				System.out.println("Introduce uno mas grande que otro");
			}
		} while (numeroP == numeroG);
		
		if(numeroP>numeroG) {
			cambio=numeroP;
			numeroP=numeroG;
			numeroG=cambio;
		}
		
		System.out.println("Este es el numero pequeño "+ numeroP);
		
		System.out.println("Este es el numero grande "+ numeroG);
	}
}
