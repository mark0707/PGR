package main;

public class Ej1 {
	public static void main(String[] args) {
		int[]array=new int[10];
		
		
		for(int i=0;i<array.length;i++) {
			int numAle = (int) (Math.random()*(51+50)-50);
			array[i]=numAle;
			System.out.println(i+". Este es el numero que se ha guardado en la primera posicion: "+numAle);
		}

	}
}
