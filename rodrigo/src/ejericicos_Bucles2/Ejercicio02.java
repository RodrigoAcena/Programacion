package ejericicos_Bucles2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int interMax;
		int interMin;
		do {
			System.out.println("Introduce el Maximo: ");
			interMax = entrada.nextInt();
		
			System.out.println("Introduce el Minimo: ");
			interMin = entrada.nextInt();
		
			if(interMin >= interMax) {
				System.out.println("Incorrecto, repita otra vez.");
			}
		} while(interMin < interMax);
		
		int suma = 0;
		int contador = 0;
		int num;
		
		boolean borde = false;
		
		do {
			System.out.println("Introduce un numero (cierra pulsando 0): ");
			num = entrada.nextInt();
			if(num != 0) {
				if(num > interMax || num < interMin) {
					contador++;
				} else if(num < interMax && num > interMin) {
					suma += num;
				} else {
					borde = true;
				}
			}
		} while(num != 0);
		
		System.out.println("Numeros totales: "+suma);
		System.out.println("Numeros fuera del intervalo: "+contador);
		entrada.close();
	}

}
