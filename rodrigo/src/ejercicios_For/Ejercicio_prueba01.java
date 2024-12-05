package ejercicios_For;

import java.util.Scanner;

public class Ejercicio_prueba01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String cadena = entrada.nextLine();
		System.out.println("Introduce un caracter: ");
		char caracter = entrada.next().charAt(0);
		entrada.close();
		
		int contador = 0;
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i)==caracter) {
				contador++;
			}
		}
		
		System.out.println("El caracter "+caracter+" aparece "+contador+" veces");

	}

}
