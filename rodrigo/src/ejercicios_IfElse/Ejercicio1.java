package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un entero: ");
		int entero = entrada.nextInt();
		entrada.close();
		
		if (entero % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}

}

