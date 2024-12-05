package repaso_recuperacion;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1-Comprobar numero\n"+"2-Combrobar parentesis y corchetes\n"+"3-Salir");
		System.out.println("");
		System.out.print("Opcion: ");
		int opcion = entrada.nextInt();
		entrada.nextLine();
		
		switch(opcion) {
		case 1:
			System.out.println("Introduce un entero: ");
			int entero = entrada.nextInt();
			entrada.nextLine();
			if(entero < 0){
				System.out.println("Numero negativo");
			} else {
				if(entero % 5 == 0) {
					System.out.println("Multiplo de 5");
				} else {
					System.out.println("No es multiplo de 5");
				}
			}
			break;
		case 2:
			System.out.println("Introduce una cadena: ");
			String cadena = entrada.nextLine();
			if(cadena.length()>1){
				System.out.println("Tiene mas de un caracter");
			}
			else {
				if(cadena.contains("(") || cadena.contains(")") ||
						cadena.contains("[") || cadena.contains("]")){
					System.out.println("Hay parentesis");
				} else {
					System.out.println("No hay parentesis");
				}
			}
			break;
		case 3:
			break;
		default:
			System.out.println("Opcion incorrecta");
		}
		entrada.close();

	}

}
