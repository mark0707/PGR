package main;

public class Ej2 {

	public static void main(String[] args) {
		int[] array = new int[10];
		float raiz;

		for (int i = 0; i < array.length; i++) {
			int numAle = (int) (Math.random() * (51 + 50) - 50);
			array[i] = numAle;
			System.out.println(i + ". Este es el numero que se ha guardado en la primera posicion: " + numAle);
		
			raiz= (float) Math.sqrt(numAle);
			if(numAle<0) {
				System.out.println("Numero negativo");
			}else{
				System.out.println("La raiz cuadrada es: "+raiz);
			}
			
			
		}
		
		
	}

}
