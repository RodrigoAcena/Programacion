package ejericicos_Bucles2;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce una cadena de texto: ");
		String cadena = entrada.nextLine();
		
		System.out.print("Introduce el primer caracter: ");
		char primerCaracter = entrada.nextLine().charAt(0);
		
		System.out.print("Introduce el segundo caracter: ");
		char segundoCaracter = entrada.nextLine().charAt(0);
		String resultado = "";

		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			
			if (c == primerCaracter) {
				resultado += segundoCaracter;
			} else {
				resultado += c;

			}
			System.out.println("Resultado: " + resultado);
		}
		entrada.close();

	}

}
