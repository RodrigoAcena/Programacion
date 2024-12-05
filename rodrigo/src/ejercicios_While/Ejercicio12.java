package ejercicios_While;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String caracter= "";
		
		while(caracter.length() != 1) {
			System.out.println("Caracter a buscar: ");
			caracter = entrada.nextLine();
			if(caracter.length()==1) {
				break;
			}
			else {
				System.out.println("Introduce solo un caracter");
			}
		}
		System.out.println("Introduce una cadena: ");
		String cadena = entrada.nextLine();
		
		int i = 0;
		int contador = 0;
		char buscar = caracter.charAt(0);
		
		while(i<cadena.length()) {
			if(cadena.charAt(i)==buscar) {
				contador++;
			}
			i++;
		}
		System.out.println("Cantidad de veces que aparece '"+caracter+"' en la cadena '"+cadena+"' es: "+contador);
		entrada.close();
	}

}
