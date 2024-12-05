package ejericicos_Bucles2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int mayor0 = 0, menor0 = 0, igual0 = 0;
		
		boolean seguimos = true;
		
		do {
			System.out.println("Introduce un numero (o pulsa 'q' para salir): ");
			if(entrada.hasNextInt()) {
				num = entrada.nextInt();
				if(num < 0) {
					menor0++;
				} else if(num > 0) {
					mayor0++;
				} else if(num == 0) {
					igual0++;
				}
			} else if(entrada.next().equals("q")) {
				seguimos = false;
			}
			
		} while(seguimos);
		
		System.out.println("Numeros mayores que 0: "+mayor0);
		System.out.println("Numeros menores que 0: "+menor0);
		System.out.println("Numeros iguales que 0: "+igual0);
		
		entrada.close();
	}

}
