package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introdece un caracter: ");
		char letra = entrada.next().charAt(0);
		
		if(Metodos.esDigito(letra)) {
			System.out.println("Es digito");
		} else {
			System.out.println("No es digito");
		}
		entrada.close();

	}

}
