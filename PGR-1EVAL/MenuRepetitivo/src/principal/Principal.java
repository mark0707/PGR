package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int opc;
		
		
		
		do {
			System.out.println("introduce la opcion de menu"); 
			System.out.println("Opcion 1");
			System.out.println("Opcion 2");
			System.out.println("Opcion 3");
			System.out.println("Opcion 4 (salir)");
			opc=sc.nextInt();
			
		
			
			
			if(opc==1) {
				System.out.println("Clickaste 1 \n");
			}else if(opc==2) {
				System.out.println("Clickaste 2 \n");
			}else if(opc==3) {
				System.out.println("Clickaste 3 \n");
			}else {
				System.out.println("Esto es la opcion Salir");
			}			
			
		}while(opc>=1 && opc<=3);
		
		

	}

}
