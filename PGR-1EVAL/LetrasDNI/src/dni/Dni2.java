package dni;

import java.util.Scanner;

public class Dni2 {

	public static void main(String[] args) {
		char[] arrayLetra = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		Scanner sc = new Scanner(System.in);
		String dni;
		char letra;
		int dniNoLetra;
		do {
			do {
				System.out.println("Introduce tu dni y letra");
				dni = sc.next();
			}while(dni.length()!=7);
						

			letra = dni.charAt(8);
			letra = Character.toUpperCase(letra);

			dniNoLetra = Integer.parseInt(dni.substring(0, 8));

			dniNoLetra = dniNoLetra % 23;
			if (arrayLetra[dniNoLetra] == letra) {
				System.out.println("El DNI es valido");
			} else {
				System.out.println("DNI no valido");
			}

		} while (arrayLetra[dniNoLetra] != letra);

	}

}
