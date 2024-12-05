package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un caracter: ");
		char car1 = entrada.nextLine().charAt(0);
		
		System.out.print("Introduce otro caracter: ");
		char car2 = entrada.nextLine().charAt(0);
		entrada.close();
		
		if (car1 == car2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
	}

}
