package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una cadena: ");
		String c1 = entrada.nextLine();
		System.out.print("Introduce otra cadena: ");
		String c2 = entrada.nextLine();
		entrada.close();
		
		if (c1.equals(c2)) {
			System.out.println("Son iguales");
		} else if (c1.equalsIgnoreCase(c2)) {
			System.out.println("Son iguales (salvo caso)");
		} else {
			System.out.println("Son distintas");
		}
	}

}
