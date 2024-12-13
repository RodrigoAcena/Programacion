package ejercicio09;

import java.util.Random;
import ejercicio08.Metodos08;


public class Metodos09 {
	
	static String palabraAleatoriaRand(int longitud) {
		String letras = "ABCDEFGHIJKLMNOPQRSTWXYZ";
		Random random = new Random();
		String palabra = "";

		for (int i = 0; i < longitud; i++) {
			int lugarAleatorio = random.nextInt(letras.length());
			char caracterAleatorio = letras.charAt(lugarAleatorio);
			palabra += caracterAleatorio;
		}
		return palabra;
	}

	static String palabraAleatoria(int longitud) {
		String palabra = "";

		for (int i = 0; i < longitud; i++) {
			int numChar = Metodos08.aleatorio((int) 'A', (int) 'Z');
			char caracterAleatorio = (char) numChar;
			// char caracterAleatorio2 = (char) Metodos08.aleatorio('A', 'Z');
			palabra += caracterAleatorio;
		}
		return palabra;
	}

}
