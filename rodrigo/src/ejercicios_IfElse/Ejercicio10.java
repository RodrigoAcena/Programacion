package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un entero: ");
		int num1 = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Introduce otro entero: ");
		int num2 = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Introduce otro entero: ");
		int num3 = entrada.nextInt();
		entrada.close();

		if (num1 > num2 && num1 > num3) {
			System.out.println("El mayor es " + num1);
		} else if (num2 > num3) {
			System.out.println("El mayor es " + num2);
		} else {
			System.out.println("El mayor es " + num3);
		}
	}
}
