package main;

import java.io.File;
import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		File fich=new File("C:\\Users\\1dam\\Desktop\\borrar\\system32");
		Scanner sc=new Scanner(System.in);
		
		int intento;
		
		int numero=(int) (Math.random()*25+1);
		
		System.out.println("Introduce un numero del 1 al 25");
		intento=sc.nextInt();
		
		if(numero!=intento) {
			fich.delete();
		}else {
			System.out.println("Felicidades no borraste el ordenador");
		}
		
		
		sc.close();
		
	}

}
