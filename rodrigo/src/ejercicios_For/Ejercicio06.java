package ejercicios_For;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingresa el lado: ");
		int lado = entrada.nextInt();
		
		if(lado >= 1) {
			for(int x = 1; x <= lado; x++) {
				for(int y = 1; y <= lado; y++) {
					System.out.print("X ");
				}
				System.out.println();
			}
		}
		entrada.close();
		

	}

}
