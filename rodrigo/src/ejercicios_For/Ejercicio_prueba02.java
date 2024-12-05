package ejercicios_For;

import java.util.Scanner;

public class Ejercicio_prueba02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce numero 1: ");
		int a = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduce numero 2: ");
		int b = entrada.nextInt();
		boolean negativo = b < 0;
		b = negativo ? -b : b;
		entrada.close();
		
		int potencia = 1;
		for(int i = b; i >= 0; i--){
			potencia *= negativo ? 1.0/a : a;
		}
		
		System.out.println("La potencia es: "+potencia);
	}

}
