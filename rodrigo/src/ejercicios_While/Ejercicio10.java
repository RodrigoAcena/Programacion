package ejercicios_While;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int contador, suma, entero;
		contador = suma = 0;
		
		do {
			System.out.println("Introduce un entero (0 para salir): ");
			entero = entrada.nextInt();
			contador++;
			suma += entero;
		}
		while(entero != 0);
		entrada.close();
		
		System.out.println("Han entrado un total de "+(contador-1)+" numeros cuya suma es "+suma);
	}
	
}