package practica;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float numero1 = 3.3f, numero2 = 7;
		boolean bMenor;
		boolean bOtro;
		boolean mayor1, mayor2;	
		
		
		
		
		System.out.println("Introduce el primer numero");
		numero1 = sc.nextFloat();
		System.out.println("Introduce el segundo numero");
		numero2 = sc.nextFloat();

		bMenor = (numero1 > numero2);
		bOtro = (bMenor && (4 + 3 == 9 - 2));
		System.out.println("El primer numero es menor que el segundo " + bMenor);
		System.out.println("La expresion es correcta " + bOtro + "\n");
		
		
		mayor1=(numero1>numero2);
		mayor2=(numero2>numero1);
		
		if(mayor1) {
			System.out.println("num1 mayor que num2");
		}else if(mayor2) {
			System.out.println("num2 mayor que num1");
		}else {
			System.out.println("los dos numeros iguales");
		}
		
		
		
		
		
		
		
		if (numero1 == numero2) {
			System.out.println("Son iguales");
		} else {
			if (numero1 > numero2) {
				System.out.println("Numero 1 mayor que numero 2");
			} else if (numero1 < numero2) {
				System.out.println("Numero 2 mayor que numero 1");
			}
		}
		
		
		int opc;
		opc=sc.nextInt();
		
		switch (opc) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;
		case 6:
			System.out.println("sabado");
			break;
		case 7:
			System.out.println("domingo");
			break;
		default:
			System.out.println("no has indicado nada");
		}
		
		
		
		
		
		

	}

}
