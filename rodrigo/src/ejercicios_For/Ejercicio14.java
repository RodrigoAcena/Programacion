package ejercicios_For;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String cadena;
		int contador = 0;
		
		do {
			System.out.println("Introduce una cadena: ");
			cadena = entrada.nextLine().toLowerCase();
			for(int i = 0; i < cadena.length(); i++) {
				char caracter = cadena.charAt(i);
				if(caracter == 'a' || caracter == 'e' || caracter == 'i'
						|| caracter == 'o' || caracter == 'u') {
					contador++;
				}
			}
		} while(!cadena.equals("fin"));
		System.out.println("Hay "+ contador +" vocales");
		entrada.close();

	}

}
