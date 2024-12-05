package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número de mes: ");
		int mes = entrada.nextInt();
		entrada.close();
		
		int numDias = 30;
		
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7
				|| mes == 8 || mes == 10 || mes == 12) {
			numDias = 31;
		} else if (mes == 2) {
			numDias = 28;
		}
		
		if (mes <= 12 && mes >= 1) {
			System.out.println("El mes tiene " + numDias + " dias");
		}
		else {
			System.out.println("Mes incorrecto");
		}
	}
}
