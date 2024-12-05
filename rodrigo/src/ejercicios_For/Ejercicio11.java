package ejercicios_For;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero entre 0 y 255: ");
		int num = entrada.nextInt();
		entrada.nextLine();
		
		String binario = "";
		
		for(int i = 0; i < 8; i++) {
			int resto = num%2;
			num = num/2;
			binario = resto+binario;
		}
		
		System.out.print(binario);
		entrada.close();

	}

}
