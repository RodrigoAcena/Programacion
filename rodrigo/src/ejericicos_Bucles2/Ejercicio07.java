package ejericicos_Bucles2;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Introduce una cadena: ");
		String cadena = entrada.nextLine();
		
		System.out.print("Ahora introduce un carácter: ");
		char caracter = entrada.next().toLowerCase().charAt(0);
		
		int cuentaCar = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if(c == caracter)
			cuentaCar ++;
		}
		
		System.out.println(cuentaCar);
		entrada.close();

	}

}
