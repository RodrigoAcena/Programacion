package ejercicios_For;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero positivo: ");
		int num = entrada.nextInt();
		
		if(num > 0) {
			System.out.println("Los numeros divididos son: ");
			for(int i = 1; i <= num; i++) {
				if(num%i == 0){
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("Introduce otro numero");
		}
		entrada.close();

	}

}
