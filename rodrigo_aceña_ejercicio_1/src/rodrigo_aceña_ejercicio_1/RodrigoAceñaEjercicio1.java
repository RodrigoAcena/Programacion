package rodrigo_aceña_ejercicio_1;
import java.util.Scanner;

public class RodrigoAceñaEjercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe el primer numero: ");
		int num1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Escribe el segundo numero: ");
		int num2 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduce un simbolo(+, -, *, /, %): ");
		char simbolo = entrada.next().charAt(0);
		entrada.close();
		
		switch(simbolo) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		case '%':
			System.out.println(num1%num2);
			break;
		default:
			System.out.println("ERROR: CARACTER INCORRECTO");
		}

	}

}
