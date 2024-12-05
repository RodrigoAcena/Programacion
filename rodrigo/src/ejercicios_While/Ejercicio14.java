package ejercicios_While;

import java.util.*;

public class Ejercicio14 {

	public static void main(String[] args) {
		char operador;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.print("Introduce grados: ");
			double grados = entrada.nextDouble();
			entrada.nextLine();
			
			System.out.println(grados + "ºC son "+ (grados+273)+"K");
			System.out.print("¿Repetir proceso? (S/N) ");
			
			String entrada0p = entrada.nextLine().toUpperCase();
			operador = entrada0p.charAt(0);
		} while(operador == 'S');
		
		entrada.close();

	}

}
