package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un entero: ");
		int entero1 = entrada.nextInt();
		
		System.out.print("Introduce otro entero: ");
		int entero2 = entrada.nextInt();
		entrada.close();
		
		if (entero2 != 0) {
			System.out.printf("El resultado de %d/%d es %d%n"
					, entero1, entero2, entero1/entero2);
		} else {
			System.out.println("No se puede dividir entre 0");
		}
	}
}

