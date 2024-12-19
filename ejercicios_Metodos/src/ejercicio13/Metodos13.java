package ejercicio13;

import java.util.Scanner;

public class Metodos13 {

	static String leeCadenas() {
		Scanner entrada = new Scanner(System.in);
		
		String separacion = new String();
		String cadena;
		do {
			System.out.print("Introduce frases ('fin' para salir): ");
			cadena = entrada.nextLine();
			
			if(!cadena.equalsIgnoreCase("fin")) {
				if(!separacion.isEmpty()) {
					separacion += " : ";
				}
				separacion += cadena + " : ";
			}
			
		} while(!cadena.equalsIgnoreCase("fin"));
		entrada.close();
		
		return separacion;
	}
}
