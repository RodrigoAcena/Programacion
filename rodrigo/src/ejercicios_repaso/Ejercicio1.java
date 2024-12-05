package ejercicios_repaso;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		
		if(entrada.hasNextInt()) {
			String num = entrada.next();
			if(num.endsWith("0")||num.endsWith("5")) {
				System.out.println("Divisible entre 5");
			}
			else {
				System.out.println("No es divisible entre 5");
			}
		}else {
			System.out.println("Dato invalido");
		}
		entrada.close();

	}

}
