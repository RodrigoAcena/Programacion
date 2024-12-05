package ejercicios_While;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una contraseña: ");
		String contraseña = entrada.nextLine();
		entrada.close();
		
		int i = 0;
		
		while(i < contraseña.length()) {
			System.out.print(contraseña.charAt(i) + " ");
			i++;
		}

	}

}
