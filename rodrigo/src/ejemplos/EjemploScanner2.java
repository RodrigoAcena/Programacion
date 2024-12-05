package ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class EjemploScanner2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		
		System.out.print("Introduce un entero: ");
		if (entrada.hasNextInt()) {
			int entero = entrada.nextInt();
		} else {
			System.out.println("Dato incorrecto");
		}
		
		
		entrada.close();
	}

}

