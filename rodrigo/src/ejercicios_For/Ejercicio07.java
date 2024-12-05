package ejercicios_For;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cuenta = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Introduce un numero: ");
			int num = entrada.nextInt();
			
			if(num % 3 == 0) {
				cuenta++;
			}
		}
		System.out.println("Has introducido "+cuenta+" numeros multiplos de 3");
		entrada.close();

	}

}