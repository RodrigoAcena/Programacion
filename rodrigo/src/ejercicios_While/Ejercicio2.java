package ejercicios_While;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un entero: ");
		int tope = entrada.nextInt();
		entrada.close();
		
		if(tope > 1) {
			int tope2 = tope;
			
			do {
				System.out.println(tope);
				tope--;
			} while(tope >= 1);
			
			do {
				System.out.print(tope2 + " ");
				tope2--;
			} while(tope2 >= 1);
		}
		else {
			System.out.println("El numero tiene que ser mayor que uno");
		}
	}

}
