package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce la longitud: ");
		int longi = entrada.nextInt();
		
		String cadenaGenerada = Metodos09.palabraAleatoria(longi);
		
		System.out.println("Tu Cadena Generada: " + cadenaGenerada);
		entrada.close();
	}

}
