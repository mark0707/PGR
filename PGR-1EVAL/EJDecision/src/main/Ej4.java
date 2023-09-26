package main;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int numero1;
		int numero2;
		int suma;
		
		System.out.println("Introduce los dos numeros a sumar");
		numero1=sc.nextInt();
		numero2=sc.nextInt();
		
		System.out.println("introduce los dos numeros sumados");
		suma=sc.nextInt();
		
		if(suma==numero1+numero2) {
			System.out.println("La suma de los dos numeros con la suma introducida coinciden");
		}else {
			System.out.println("La suma no coincide con los numeros introducidos");
		}
		
	}

}
