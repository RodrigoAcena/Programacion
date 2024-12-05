package ejercicios_For;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		entrada.close();
		
		boolean dividido = false;
		
		for(int i = 2; i < num/2; i++) {
			if(num%i == 0){
				dividido = true;
				break;
			}
			
		}
		
		if(!dividido && num != 1) {
			System.out.println("Numero primo");
		} else {
			System.out.println("No es numero primo");
		}

	}

}
