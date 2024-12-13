package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		int num1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduce el segundo numero: ");
		int num2 = entrada.nextInt();
		entrada.close();
		
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
//		if (num1 > num2) {
//			int extra = num1;
//			num2 = num1;
//			num1 = extra;
//		}
		
	    System.out.println("Número aleatorio entre [" + min + " - " + max + "]: " + Metodos08.aleatorio(min, max));

	}

		

}
