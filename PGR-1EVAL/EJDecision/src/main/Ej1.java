package main;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int esPar;
		
		System.out.println("Introduce un numero para calcular si es par o no");
		
		esPar=sc.nextInt();
		
		if(esPar%2==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("Es impar");
		}
		

	}

}
