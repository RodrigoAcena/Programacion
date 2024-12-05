package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un caracter: ");
		char car = entrada.nextLine().charAt(0);
		entrada.close();
		
		if (car >= '0' && car <= '9') {
			System.out.println("Es cifra");
		} else {
			System.out.println("No es cifra");
		}
	}
}
