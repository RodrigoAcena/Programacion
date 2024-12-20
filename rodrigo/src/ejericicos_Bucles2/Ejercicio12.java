package ejericicos_Bucles2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcion;
		
		do {
			System.out.println("Menu de opciones:"+
					"\t\n1.- Numeros del 1 al 100 con un while"+
					"\t\n2.- Positivos, negativos o pares"+
					"\t\n3.- Salir");
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1:
				int n = 1;
				while (n<=100 && n>0) {
					System.out.println(n);
					n++;
				}
				break;
			case 2:
				 System.out.println("Ingrese números (0 para salir):");
                 int numero;
                 do {
                     numero = entrada.nextInt();
                     if (numero != 0) {
                         if (numero > 0) {
                             System.out.print("El número es positivo y");
                         } else {
                             System.out.print("El número es negativo y");
                         }
                         if (numero % 2 == 0) {
                             System.out.println(" es par.");
                         } else {
                             System.out.println(" es impar.");
                         }
                     }
                 } while (numero != 0);
			case 3:
				break;
			default:
				System.out.println("Elige otra opcion");
			}
			
		} while(opcion != 3);
		entrada.close();

	}

}
