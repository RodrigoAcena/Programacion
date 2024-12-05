package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opción:\n"
				+ "1. Area del circulo\n"
				+ "2. Volumen de la esfera\n"
				+ "3. Salir\n");
		System.out.print("Opción: ");
		int opcion = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Introduce el radio: ");
		double radio = entrada.nextDouble();
		entrada.nextLine();
		
		switch (opcion) {
		case 1:
			if(radio < 0) {
				System.out.println(radio +" es negativo");
			}
			else {
				System.out.println(Math.PI*(radio*radio));
			}
			break;
		case 2:
			if(radio < 0) {
				System.out.println(radio +" es negativo");
			}
			else {
				System.out.println((4*Math.PI*(radio*radio*radio))/3);
			}
			break;
		case 3:
			break;
		default:
			System.out.println("Opción inválida");
		}
		
		entrada.close();
	}

}
