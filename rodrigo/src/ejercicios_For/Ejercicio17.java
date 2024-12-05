package ejercicios_For;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una altura: ");
		int altura = entrada.nextInt();
		
		for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
		}
		entrada.close();
	}
}
