package main;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		int u;
		System.out.println("Introduce un numero para calcular los impares");
		
		u=sc.nextInt();

		do{
			i++;
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}while (i < u);
		
		sc.close();

	}

}
