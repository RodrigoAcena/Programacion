package ejercicios_While;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un entero: ");
		int num = entrada.nextInt();
		entrada.close();
		
		int cifras = 0;
		
		do {
			cifras ++;
			num /= 10;
		}
		while(num != 0);
		
		System.out.println("Cifras: "+cifras);

	}

}
