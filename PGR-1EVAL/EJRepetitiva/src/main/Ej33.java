package main;

import java.util.Scanner;

public class Ej33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float nota = 0;
		float notaMax = 0;
		float notaMin = 10;
		int i=1;
		float media = 0;
		int aprobados=0;
		int suspensos=0;

		do {
			
			System.out.println(i + ". Introduce notas del uno al diez todas las veces que quieras hasta poner -1");
			nota = sc.nextFloat();
			while (nota < -1 || (nota > -1 && nota < 0) || nota > 10) {
				System.out.println("Error");
				System.out.println("Introduce un numro valido");
				nota = sc.nextFloat();
			}
			if(nota==-1) {
				i--;
				break;
			}
			
			if(nota>=5) {
				aprobados++;
			}else {
				suspensos++;
			}
			
			if (nota > notaMax) {
				notaMax = nota;
			}
			if (nota < notaMin) {
				notaMin = nota;
			}
			media = media + nota;
			i++;
		}while(nota!=-1);

		System.out.println("Notas totales " + i);
		System.out.println("Nota max: " + notaMax);
		System.out.println("Nota min: " + notaMin);
		media = media / i;
		System.out.println("Nota medida: " + media);
		System.out.println("Numero aprobados: "+aprobados);
		System.out.println("Numero suspendidos: "+suspensos);

	}

}
