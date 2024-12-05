package ejericicos_Bucles2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Primera cantidad: ");
		int cantEur = entrada.nextInt();

		System.out.print("Numero de meses de financiación: ");
		int numMeses = entrada.nextInt();
		int sumTot = 0;

		for (int i = 1; i < numMeses; i++) {
			System.out.print("Cuota " +  i + ": ");
			System.out.println(cantEur);
			sumTot += cantEur;
			cantEur *= 2;
		}
		System.out.println("Total pagado por el producto: " + sumTot);
		entrada.close();

	}

}
