package ejericicos_Bucles2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char analisis;
		do {
			System.out.println("Introduce un caracter para ver si es vocal o no (un espacio para salir): ");
			 analisis = entrada.nextLine().charAt(0);
			 
			if (String.valueOf(analisis).toLowerCase().matches("[a||e||o||u]")) {
				System.out.println("ES VOCAL");
			} else if(analisis != ' '){
				System.out.println("NO ES VOCAL");
			}
		} while(analisis != ' ' );
		System.out.println("HASTA LUEGO");
		entrada.close();
	}

}
