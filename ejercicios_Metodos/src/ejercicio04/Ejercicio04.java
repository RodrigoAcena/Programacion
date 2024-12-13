package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int num = entrada.nextInt();
		entrada.nextLine();
		
		int contador = 2;
		
		while(num > 1 && contador <= num && Metodos04.esPrimo(contador)) {
			System.out.println(contador);
			contador++;
		}
		entrada.close();

	}

}
