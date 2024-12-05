package ejercicios_Switch;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		char letra = entrada.nextLine().toLowerCase().charAt(0);
		entrada.close();
		
		switch(letra) {
		case 'a': case 'e': case 'i': case 'o': case 'u':
			System.out.println(letra+" es una vocal");
			break;
		default:
			System.out.println(letra+" no es vocal");
		}

	}

}
