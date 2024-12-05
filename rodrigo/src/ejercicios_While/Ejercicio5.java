package ejercicios_While;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double suma = 0;
		
		boolean seguimos = true;
		
		do {
			System.out.println("Introduce un numero ('q' para salir): ");
			if(entrada.hasNextDouble()) {
				suma += entrada.nextDouble();
			} else if(entrada.next().equals("q")) {
				seguimos = false;
			} else {
				System.out.println("Introduce un numero valido");
				entrada.nextLine();
			}
		}
		while(seguimos);
		
		System.out.println("La suma de los numeros es: "+suma);
		entrada.close();
	}
	
}
