package ejericicos_Bucles2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcion;
		int entero;
		
		do {
			System.out.println("Menu de opciones:"+
					"\t\n1.- Convertir a Binario"+
					"\t\n2.- Convertir a Hexadecimal"+
					"\t\n3.- Convertir a Octal"+
					"\t\n4.- Salir");
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Introduce un numero entero:");
				entero = entrada.nextInt();
				System.out.println(Integer.toBinaryString(entero));
				break;
			case 2:
				System.out.println("Introduce un numero entero:");
				entero = entrada.nextInt();
				System.out.println(Integer.toHexString(entero));
				break;
			case 3:
				System.out.println("Introduce un numero entero:");
				entero = entrada.nextInt();
				System.out.println(Integer.toOctalString(entero));
				break;
			case 4:
				break;
			default:
				System.out.println("Introduce otra opcion");
			}
		} while(opcion != 4);
		entrada.close();

	}

}
