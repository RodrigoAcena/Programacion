package ejercicios_While;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la base: ");
		int base = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Introduce el exponente: ");
		int exp = entrada.nextInt();
		entrada.close();
		
		if(exp >= 0) {
			int resultado = 1;
			while(exp > 0) {
				resultado *= base;
				exp--;
			}
			System.out.println("El resultado es: "+resultado);
		}
		else {
			System.out.println("El exponente tiene que ser positivo");
		}

	}

}
