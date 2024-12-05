package ejercicios_repaso;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Introuce numero a: ");
		a  = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Introuce numero b: ");
		b  = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Introuce numero c: ");
		c  = entrada.nextDouble();
		entrada.nextLine();
		
		double disc = b*b - 4*a*c;
		
		if(disc > 0) {
			double x1, x2;
			
			x1 = (-b + Math.sqrt(disc))/2*a;
			x2 = (-b - Math.sqrt(disc))/2*a;
			
			System.out.println("Tiene 2 soluciones que son "+x1+" y "+x2);
		} else if(disc == 0) {
			double x = -b/2*a;
			
			System.out.println("Tiene 1 solucion que es "+x);
		} else {
			System.out.println("No hay solucion real");
		}
		entrada.close();
	}

}
