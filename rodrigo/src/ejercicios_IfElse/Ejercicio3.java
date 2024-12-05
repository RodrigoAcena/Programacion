package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Un caracter: ");
		char car = entrada.nextLine().charAt(0);
		entrada.close();
		
		if ((car >= 'A' && car <= 'Z') || car == 'Ñ') {
			System.out.println("Es mayúsucula");
		} else {
			System.out.println("Es minúscula");
		}
	}

}

