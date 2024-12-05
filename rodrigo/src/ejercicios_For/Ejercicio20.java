package ejercicios_For;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int num = entrada.nextInt();
		entrada.close();

		int cuantosPrimos = 0;
		String primos = "";

		for (int j = 2; j <= num; j++) {
			boolean dividido = false;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					dividido = true;
					break;
				}
			}
			if (!dividido) {
				cuantosPrimos++;
				primos += j + " ";
			}
		}
		
		System.out.println("Entre el 1 y el " + num + " hay " + cuantosPrimos + " primos : " + primos);
	}

}

