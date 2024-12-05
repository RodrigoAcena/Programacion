package ejemplos;
import java.util.Scanner;

public class EjemploSwitchCase {
	enum Mes { ENERO, FEBRERO, MARZO }

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una opción (1-4): ");
		int opcion = entrada.nextInt();
		entrada.nextLine();
		
		switch (opcion) {
		case 1:
			System.out.println("Has elegido la opción 1");
			break;
		case 2: case 4:
			System.out.println("Has elegido una opción par");
			break;
		case 3:
			System.out.println("Has elegido la opción 3");
		}
		
		System.out.print("¿Estás contento con tu elección? (s/n): ");
		char eleccion = entrada.next().toLowerCase().charAt(0);
		entrada.close();
		
		switch (eleccion) {
		case 's':
			System.out.println("Me alegro");
			break;
		case 'n':
			System.out.println("Pues vaya");
		}
	}

}
