package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una edad: ");
		int edad = entrada.nextInt();
		
		if(Metodos.esMayorDeEdad(edad)) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		entrada.close();

	}

}
