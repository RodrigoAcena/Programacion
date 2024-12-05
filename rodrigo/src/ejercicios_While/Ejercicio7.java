package ejercicios_While;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("1.Opcion 1\n"+
				"2.Opcion 2\n"+
				"3.Salir");
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();
		
			switch(opcion) {
			case 1:
				System.out.println("Opcion seleccionada: "+opcion);
				break;
			case 2:
				System.out.println("Opcion seleccionada: "+opcion);
				break;
			case 3:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opcion incorrecta");
			}
		}
		while(opcion != 3);
		entrada.close();
	}

}
