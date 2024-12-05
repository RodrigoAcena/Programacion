package ejercicios_While;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce total de litros: ");
		int total = entrada.nextInt();
		
		int cantidad = 0;
		
		while (cantidad < total) {
			System.out.println("Hay "+cantidad+" litros");
			System.out.print("Agua a meter o sacar: ");
			int cantUsuario = entrada.nextInt();
			
			cantidad += cantUsuario;
			
			cantidad = cantidad < 0 ? 0 : cantidad;
			//Math.clamp
		}
		entrada.close();
		
		if(cantidad > total) {
			System.out.println("Nos hemos pasado");
		}
		else {
			System.out.println("");
		}
	}
}
