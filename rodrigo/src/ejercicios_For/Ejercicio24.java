package ejercicios_For;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dime la tabla de multiplicar que quieres: ");
		int tabla = entrada.nextInt();
		
		System.out.println("La tabla del " + tabla);
		
		int mult;
		
		for (int i = 0; i <= 10; i++) {
			mult = tabla * i;
			System.out.println(tabla + " x " + i + " = " +  mult);
		}
		entrada.close();

	}

}
