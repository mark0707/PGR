package main;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numMax;
		int notaAlumno;
		char letra;
		boolean trabajos;
		System.out.println("Introduce la nota maxima del examen");
		numMax = sc.nextInt();
		System.out.println("Introduce la nota del alumno");
		notaAlumno = sc.nextInt();
		System.out.println("¿Ha entregado los trabajos? s/n");
		letra=sc.next().charAt(0);
		if(letra=='s' || letra=='S') {
			trabajos=true;
		}else {
			trabajos=false;
		}
		if(numMax/2<=notaAlumno && trabajos==true) {
			System.out.println("Aprobado");
		}else {
			System.out.println("Suspendido");
		}
	}

}
