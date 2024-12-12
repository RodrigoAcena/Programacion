package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		int num1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduce el segundo numero: ");
		int num2 = entrada.nextInt();
		entrada.close();
		
		System.out.println(Metodos.aleatorio(num1, num2));
		

	}

}
