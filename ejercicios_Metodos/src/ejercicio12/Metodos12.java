package ejercicio12;

import java.util.Scanner;

public class Metodos12 {

	static String leeCaracteres() {
		Scanner entrada = new Scanner(System.in);
		
		String separacion = new String();
		char caracter;
		do {
			System.out.print("Introduce caracteres: ");
			caracter = entrada.next().charAt(0);
			
			if(caracter != '0') {
				separacion += caracter + " ";
			}
			
		} while(caracter != '0');
		entrada.close();
		
		return separacion;
		
	}
}
