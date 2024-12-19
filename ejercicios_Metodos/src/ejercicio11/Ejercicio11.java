package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		String cadena = entrada.nextLine();
		System.out.println("Introduce un desfase: ");
		int desfase = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println(Metodos11.cifrar(cadena, desfase));
		entrada.close();

	}

}
