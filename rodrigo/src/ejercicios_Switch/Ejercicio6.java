package ejercicios_Switch;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		float num1 = entrada.nextFloat();
		entrada.nextLine();
		System.out.println("Introduce otro numero: ");
		float num2 = entrada.nextFloat();
		entrada.nextLine();
		System.out.println("Introduce un simbolo(+, -, *, /, %): ");
		char simbolo = entrada.next().charAt(0);
		entrada.close();
		
		switch(simbolo) {
		case '+':
			System.out.println(num1+num2);
		case '-':
			System.out.println(num1-num2);
		case '*':
			System.out.println(num1*num2);
		case '/':
			System.out.println(num1/num2);
		case '%':
			System.out.println(num1%num2);
		default:
			System.out.println("ERROR");
		}

	}

}
