package main;

import java.util.Scanner;

public class Ej29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float i=0;
		float u;
		float suma=0;
		do {
			System.out.println("introduzca 10 numeros");
			u=sc.nextInt();
			if(u==0) {
				
				System.out.println("Introduciste un 0 este es el resultado de los numeros metidos");
				break;
			}
			suma=suma+u;
			
			
			i++;
		}while(i<10);
		System.out.println("suma: "+suma);
		suma=suma/i;
		System.out.println("media: "+suma);
		sc.close();
	}

}
