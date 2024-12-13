package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un límite: ");
		int limite = sc.nextInt();
		
		System.out.println("Número aleatorio: " + Metodos05.aleatorio(limite));
		
		sc.close();

	}


}
