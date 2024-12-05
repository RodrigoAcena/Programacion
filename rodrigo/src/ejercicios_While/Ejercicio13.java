package ejercicios_While;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		double total = 0;
		double nota;
		
		do {
			System.out.print("Introduce una nota: ");
			nota = entrada.nextDouble();
			
			if(nota>=0){
				n++;
				total += nota;
			}
		} while(nota > 0);
		System.out.println("La nota media es: "+(total/n));
		entrada.close();

	}

}
