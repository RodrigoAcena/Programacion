package ejercicios_For;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		
		int suma = 0;
		for(int i = 1; i < num; i++) {
			if(num%i == 0 && i != num){
				suma += i;
			}
		}
		
		if(suma == num) {
			System.out.println("Es perfecto");
		} else {
			System.out.println("No es perfecto");
		}
		entrada.close();

	}

}
