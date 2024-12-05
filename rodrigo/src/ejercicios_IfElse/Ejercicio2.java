package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un entero: ");
		int entero = entrada.nextInt();
		entrada.close();
		
		if (entero % 10 == 0) {
			System.out.println("Es múltiplo de 10");
		} else {
			System.out.println("No es múltiplo de 10");
		}
	}

}

