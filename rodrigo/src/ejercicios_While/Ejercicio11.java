package ejercicios_While;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cantidad de sueldos: ");
		int	cantidadSueldos = entrada.nextInt();
		
		double max = 0;
		int contador = 0;
		double sueldo;
		
		while(contador < cantidadSueldos) {
			System.out.println("Introduce un sueldo: ");
			sueldo = entrada.nextDouble();
			
			if(sueldo>max) {
				max = sueldo;
			}
			contador++;
		}
		
		System.out.println("Sueldo mas grande: "+max);
		entrada.close();

	}

}
