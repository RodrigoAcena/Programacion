package ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		
		System.out.print("Dame un entero: ");
		int entero = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Dame otro entero: ");
		int entero2 = entrada.nextInt();
		
		System.out.print("Dame un doble: ");
		double doble = entrada.nextDouble();
		
		System.out.println(entero + ", " + entero2 + ", " + doble);
		
		entrada.close();
	}

}
