package ejercicios_For;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int numMayor = entrada.nextInt();
		int numMenor;
		do {
			System.out.println("Introduce un numero menor que "+numMayor+": ");
			numMenor = entrada.nextInt();
		} while(numMenor >= numMayor);
		
		for (int i = numMayor; i >= numMenor; i--) {
			System.out.print(i+" ");
		}
		entrada.close();

	}

}
