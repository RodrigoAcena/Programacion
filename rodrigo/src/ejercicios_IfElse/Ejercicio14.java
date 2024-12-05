package ejercicios_IfElse;
import java.util.*;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		
		System.out.print("Introduce tu altura (m): ");
		double altura = entrada.nextDouble();
		entrada.nextLine();
		System.out.print("Introduce tu peso (kg): ");
		double peso = entrada.nextDouble();
		entrada.close();
		
		double imc = peso / (altura*altura);
		
		if (imc < 16) {
			System.out.println("Ingreso");
		} else if (imc < 17) {
			System.out.println("Infrapeso");
		} else if (imc < 18) {
			System.out.println("Bajo peso");
		} else if (imc < 25) {
			System.out.println("Normopeso");
		} else if (imc < 30) {
			System.out.println("Sobrepeso");
		} else if (imc < 35) {
			System.out.println("Sobrepeso II");
		} else if (imc < 40) {
			System.out.println("Obesidad premórbida");
		} else {
			System.out.println("Obesidad mórbida");
		}
	}
}

