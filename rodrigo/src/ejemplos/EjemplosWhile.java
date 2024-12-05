package ejemplos;

import java.util.Scanner;

public class EjemplosWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("Introduce un entero: ");
		boolean tenemosInt = false;
		
		do {
			tenemosInt = entrada.hasNextInt();
			if (tenemosInt) {
				n = entrada.nextInt();
			} else {
				String incorrecto = entrada.next();
				System.out.print(incorrecto + " no es un entero, introduce un entero: ");
			}
			entrada.nextLine();
		} while (!tenemosInt);
		
		System.out.println("Entero: "+ n);
		entrada.close();
	}

}

