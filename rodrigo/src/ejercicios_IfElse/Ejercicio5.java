package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("introduce un caracter: ");
		char c1 = entrada.nextLine().charAt(0);
		System.out.print("introduce otro caracter: ");
		char c2 = entrada.nextLine().charAt(0);
		entrada.close();
		
		if (Character.isLowerCase(c1) && Character.isLowerCase(c2)) {
			System.out.println("Los dos son minúsculas");
		} else {
			System.out.println("No son minúsculas los dos");
		}
	}

}

