package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un entero: ");
		int entero = entrada.nextInt();
		entrada.close();
		
		if (entero <= 0b1111111 && entero >= 0) {
			System.out.println("El caracter correspondiente en la tabla ASCII es: "
					+ (char) entero);
		} else {
			System.out.println("No hay caracter correspondiente en la tabla ASCII");
		}
	}
}

