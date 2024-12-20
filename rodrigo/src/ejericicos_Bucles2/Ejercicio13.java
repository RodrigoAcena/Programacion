package ejericicos_Bucles2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcion;
		
		do {
			System.out.println("Menu de opciones:"+
					"\t\n1.- Volumen esfera"+
					"\t\n2.- Numero de tres cifras con cifras por separado"+
					"\t\n3.- Letras minusculas"+
					"\t\n4.- Pares entre dos numeros"+
					"\t\n5.- Salir");
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.print("Introduce el radio de la esfera: ");
				double numero = entrada.nextDouble();
				entrada.nextLine();
				System.out.println("Volumen de la esfera: " + (4*Math.PI*Math.pow(numero, 3))/3);
				break;
			case 2:
				System.out.print("Introduce un número de tres cifras: ");
				int entero = entrada.nextInt();
				if(entero >= 100 && entero <= 999) {
					String numeroS = Integer.toString(entero);
					for (int i = 0; i < numeroS.length(); i++) {
						System.out.print(numeroS.charAt(i) + " ");
					}
					System.out.println();
				} else {
					System.out.println("Este numero no tiene tres cifras");
				}
				break;
			case 3:
				System.out.print("Introduce un caracter: ");
				char caracterUno = entrada.nextLine().charAt(0);
				System.out.print("Introduce otro caracter: ");
				char caracterDos = entrada.nextLine().charAt(0);
				entrada.nextLine();
				
				if (caracterUno >= 'a' && caracterUno <= 'z') {
					System.out.println("El primer caracter es una minúscula");
				} else {
					System.out.println("El primer caracter no es una minúscula");
				}
				if (caracterDos >= 'a' && caracterDos <= 'z') {
					System.out.println("El segundo caracter es una minúscula");
				} else {
					System.out.println("El segundo caracter no es una minúscula");
				}
			case 4:
				System.out.println("Introduce el primer número: ");
				int numeroUno = entrada.nextInt();
				System.out.println("Introduce el segundo número: ");
				int numeroDos = entrada.nextInt();
				entrada.nextLine();
				
				int aux;
				if (numeroUno < numeroDos) {
					System.out.print("Los números pares entre " + numeroUno + " y "
							+ numeroDos + " son: ");
					for (int i = numeroUno + 1; i < numeroDos; i++) {
						if (i%2 == 0) {
							System.out.print(i + " ");
						}
					}
					System.out.println();
				} else if (numeroDos < numeroUno) {
					System.out.print("Los números pares entre " + numeroDos + " y "
							+ numeroUno + " son: ");
					aux = numeroDos;
					numeroDos = numeroUno;
					numeroUno = aux;
					for (int i = numeroDos + 1; i < numeroUno; i++) {
						if (i%2 == 0) {
							System.out.print(i + " ");
						}
					}
					System.out.println();
				} else {
					System.out.println("No hay pares entre ellos, porque los números que has introducido son iguales");
				}
			case 5:
				break;
			default:
				System.out.println("Opcion incorrecta");
			}
		} while(opcion != 5);
		entrada.close();

	}

}
