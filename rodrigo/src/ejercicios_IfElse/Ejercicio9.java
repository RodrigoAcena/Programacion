package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un entero: ");
		int entero1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Introduce otro entero: ");
		int entero2 = entrada.nextInt();
		entrada.close();
		
		if (entero1 > entero2) {
			System.out.println("El primero es mayor");
		} else if (entero2 > entero1) {
			System.out.println("El segundo es mayor");
		} else {
			System.out.println("Son iguales");
		}
	}

}

