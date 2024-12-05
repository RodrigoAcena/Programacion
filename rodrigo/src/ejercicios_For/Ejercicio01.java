package ejercicios_For;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		int tope;
		do {
			System.out.println("Introduce un numero mayor que 1: ");
			tope = entrada.nextInt();
		}
		while (tope < 1);
		
		for(int i = 1; i <= tope; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nFin del programa");
		entrada.close();

	}

}
