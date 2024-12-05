package ejemplos;

import java.util.Scanner;

public class EjemplosFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena: ");
		String cadena = entrada.nextLine().toLowerCase();
		entrada.close();
		
		String vocales = "aeiou";
		
		for(int i = 0; i < vocales.length(); i++) {
			cadena = cadena.replaceAll(String.valueOf(vocales.charAt(i)), "i");
		}
		
		System.out.println(cadena);
	}

}
