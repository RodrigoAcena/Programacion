package ejericicos_Bucles2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner entrada = new Scanner(System.in);
		String opcion = new String();
		String[] palabras = "pizarra cascos camion chicle mitocondria bateria borrador mesa ordenador".toLowerCase().split(" ");
		
		do {
			String oculta = palabras[r.nextInt(palabras.length)];
		
			boolean victoria = false;
			while(victoria == false) {
				int letrasFallidas = 0;
				System.out.println("Buenas, escribe una palabra de " + oculta.length() + " caracteres a ver si aciertas ([q] para salir)");
				opcion = entrada.nextLine();
				if(opcion.charAt(0) == 'q' && opcion.length() == 1) {
					break;
				}
				if(opcion.length()!= oculta.length()) {
					System.out.println("La palabra introducida no tiene el número de carácteres exigido");
					continue;
				}
				if(opcion.equals(oculta)) {
					System.out.println("Bien hecho");
					victoria = true;
					continue;
				}
				
				for(int i = 0;i < opcion.length();i++) {
					char letra = opcion.charAt(i);
					if(letra == oculta.charAt(i) && oculta.indexOf(letra) == oculta.lastIndexOf(letra)) {
						System.out.println(opcion.charAt(i) + " esta en la posicion correcta");
				
					} else if (letra == oculta.charAt(i) && (oculta.indexOf(letra) != oculta.lastIndexOf(letra))) {
						System.out.println("Una de las  " + letra + " está en la posición correcta");
					} else {
						letrasFallidas++;			
					}
					if(letrasFallidas == opcion.length()) {
						System.out.println("Ninguna letra coincide");
					}
				}
			}
		}while(opcion.charAt(0) != 'q');
		System.out.println("Programa terminado");
		entrada.close();

	}

}
