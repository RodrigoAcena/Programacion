package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una hora");
		
		System.out.print("Introduce horas: ");
		int hor = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Introduce minutos: ");
		int min = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Introduce segundos: ");
		int sec = entrada.nextInt();
		entrada.close();
		
		if (hor < 0 || min < 0 || sec < 0 || hor >= 24 || min > 59 || sec > 59) {
			System.out.println("Hora incorrecta");
		} else {
			System.out.println("Hora correcta");
		}
	}
}
