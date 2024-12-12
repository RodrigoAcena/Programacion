package ejercicio09;

import java.util.Random;

public class Metodos {
	
	static String palabraAleatoria(int longitud) {
		String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		Random ran = new Random();
		String palabra = "";
		
		for (int i = 0; i < longitud; i++) {
			char lugarAleatorio = (char) ran.nextInt(letras.length());
			char carAleatorio = letras.charAt(lugarAleatorio);
			palabra += carAleatorio;
		}
		return palabra;
	}
}
