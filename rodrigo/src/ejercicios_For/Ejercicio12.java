package ejercicios_For;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto: ");
		String cadena = entrada.nextLine().toLowerCase();
		
		System.out.println("Caracteres de la cadena:");
		for(int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
		
		int totalchar = cadena.length();
		int contarA, contarE, contarI, contarO, contarU;
		contarA = 0;
		contarE = 0;
		contarI = 0;
		contarO = 0;
		contarU = 0;
		
		for(int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			switch(c) {
			case 'a': contarA++; break;
			case 'e': contarE++; break;
			case 'i': contarI++; break;
			case 'o': contarO++; break;
			case 'u': contarU++; break;
			}
		}
		System.out.println("\nPorcentaje de vocales:");
		System.out.println("\nPorcentaje de A: "+(contarA*100.0)/totalchar);
		System.out.println("\nPorcentaje de E: "+(contarE*100.0)/totalchar);
		System.out.println("\nPorcentaje de I: "+(contarI*100.0)/totalchar);
		System.out.println("\nPorcentaje de O: "+(contarO*100.0)/totalchar);
		System.out.println("\nPorcentaje de U: "+(contarU*100.0)/totalchar);
		entrada.close();

	}

}
