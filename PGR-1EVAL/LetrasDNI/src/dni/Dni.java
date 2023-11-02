package dni;

import java.util.Scanner;

public class Dni {

	public static void main(String[] args) {

		char[]arrayLetra={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		Scanner sc = new Scanner(System.in);
		int dni;

		do{
			System.out.println("Introduce tu dni y te dire la letra");
			dni = sc.nextInt();
			if(dni>100000000 || dni<9999999){
				System.out.println("Mal introducido");
			}
		}while(dni>100000000 || dni<9999999);
		
		dni = dni % 23;
		System.out.println("letra " + arrayLetra[dni]);

		

	}

}
