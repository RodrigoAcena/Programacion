package ejercicios_For;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingresa el largo: ");
		int largo = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Ingresa el ancho: ");
		int ancho = entrada.nextInt();
		entrada.nextLine();
		
		for(int x = 1; x <= ancho; x++) {
			for(int y = 1; y <= largo; y++) {
				System.out.print("X ");
			}
			System.out.println();
		}
		
		entrada.close();
		

	}

}
