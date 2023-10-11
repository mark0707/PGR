package ejercicios;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int diaTrabaj;
		int horaTrabaj;
		int horaSema;
		float sueldoSema;
		float dineroGast = 0;
		char opc;
		float porcenExtra;
		float treintaPorcen;

		do {
			do {
				System.out.println("Cuantos dias de la semana ha trabajado el empleado");
				diaTrabaj = sc.nextInt();
				if (diaTrabaj <= 0 || diaTrabaj > 7) {
					System.out.println("Los dias en una semana introducidas no son adecuadas");
				}
			} while (diaTrabaj <= 0 || diaTrabaj > 7);
			do {
				System.out.println("Cuantas horas al dia ha trabajado el empleado");
				horaTrabaj = sc.nextInt();
				if (horaTrabaj <= 0 || horaTrabaj > 24) {
					System.out.println("Las horas diarias introducidas no son adecuadas");
				}
			} while (horaTrabaj <= 0 || horaTrabaj > 24);

			// Calcular horas semanales
			horaSema = diaTrabaj * horaTrabaj;
			// Sueldo sin extra
			sueldoSema = horaSema * 45.56f;

			if (horaTrabaj > 8) {
				// Calcular el porcentaje extra
				porcenExtra = (3 * (horaSema - (diaTrabaj * 8)));
				porcenExtra = porcenExtra / 100;

				// Calcular 130% del sueldo sin extras
				treintaPorcen = sueldoSema * 0.3f;
				treintaPorcen = sueldoSema + treintaPorcen;

				// Sumarle el extra al sueldo inicial
				porcenExtra = sueldoSema * porcenExtra;
				sueldoSema = sueldoSema + porcenExtra;

				if (sueldoSema > treintaPorcen) {
					System.out.println("El sueldo con horas extras esta 30% mas alto que el sueldo sin horas extras");
					sueldoSema = treintaPorcen;
				}
			}
			System.out.printf("Este es el sueldo semanal del empleado: " + "%.2f",sueldoSema);
			dineroGast = dineroGast + sueldoSema;

			System.out.println("Deseas calcular el sueldo semanal de algun empleado s/n");
			opc = sc.next().charAt(0);
		} while (opc == 's' || opc == 'S');

		System.out.printf("Este es el dinero gastado semanal de la empresa: " + "%.2f",dineroGast);

		sc.close();

	}

}
