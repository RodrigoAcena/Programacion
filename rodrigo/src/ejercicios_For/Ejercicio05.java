package ejercicios_For;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cuenta = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Introduce un numero: ");
			int num = entrada.nextInt();
			
			if(num<0) {
				cuenta++;
			}
		}
		System.out.println("Has introducido "+cuenta+" numeros negativos");
		entrada.close();

	}

}
