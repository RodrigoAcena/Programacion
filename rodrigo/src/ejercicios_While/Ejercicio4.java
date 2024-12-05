package ejercicios_While;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce 10 numeros");
		
		int contador = 1;
		double suma = 0;
		
		while(contador <=10) {
			System.out.println("Introduce el numero "+contador+": ");
			suma += entrada.nextDouble();
			contador++;
		}
		
		System.out.println("Suma: "+ suma);
		entrada.close();
		
	}

}
