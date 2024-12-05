package ejericicos_Bucles2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce una longitud: ");
		int longitud = entrada.nextInt();

		for (int i = 0; i <= longitud - 1; i++) {
			System.out.print("*");
		}
		System.out.println( );
		
		for (int i = 0; i < longitud - 2; i++) {
			System.out.print("*");
			for(int j = 0; j < longitud - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		for (int i = 0; i < longitud; i++) {
			System.out.print("*");
		}
		
		entrada.close();

	}

}
