package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer numero: ");
		int num1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Introduce el segundo numero: ");
		int num2 = entrada.nextInt();
		entrada.close();
		
		System.out.println("Numero maximo: " + Metodos02.maximo(num1, num2));
		System.out.println("Numero minimo: " + Metodos02.minimo(num1, num2));

	}

}
