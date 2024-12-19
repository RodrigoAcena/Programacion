package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		String num = entrada.nextLine();
		
		System.out.println(Metodos10.esEntero(num));
		
		entrada.close();

	}

}
