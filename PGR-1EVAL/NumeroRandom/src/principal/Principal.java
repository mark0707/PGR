package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numeroP;
		int numeroAleatorio = (int) (Math.random()*10+1);
	    
	    
	    do {
	    	  System.out.println("Introduce un numero para intentar adivinar");
	    	  numeroP=sc.nextInt();
	    	  
	    	  if(numeroP!=numeroAleatorio) {
	    		  System.out.println("No has acertado intentalo de nuevo");
	    	  }
	    
	    }while(numeroP!=numeroAleatorio);
	  
	    System.out.println("Felicidades ese era el numero correcto");
	    

	}

}
