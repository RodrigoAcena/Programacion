package ejercicios_For;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
				Scanner entrada = new Scanner(System.in);
				
				int sumaPositivos = 0, sumaNegativos = 0, cantidadPositivos = 0, cantidadNegativos = 0, cantidadCeros = 0;

		        System.out.println("Introduce 10 números:");
		        for (int i = 1; i <= 10; i++) {
		            System.out.print("Número " + i + ": ");
		            int numero = entrada.nextInt();

		            if (numero > 0) {
		                sumaPositivos += numero; 
		                cantidadPositivos++;    
		            } else if (numero < 0) {
		                sumaNegativos += numero; 
		                cantidadNegativos++;     
		            } else {
		                cantidadCeros++; 
		            }
		        }

		        double mediaPositivos = cantidadPositivos > 0 ? sumaPositivos / cantidadPositivos : 0;
		        double mediaNegativos = cantidadNegativos > 0 ? sumaNegativos / cantidadNegativos : 0;

		        System.out.println("Media de los números positivos: " + mediaPositivos);
		        System.out.println("Media de los números negativos: " + mediaNegativos);
		        System.out.println("Cantidad de ceros: " + cantidadCeros);
				entrada.close();

	}

}
