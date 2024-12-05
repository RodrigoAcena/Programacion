package ejercicios_For;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int minimo = Integer.MAX_VALUE, maximo = Integer.MIN_VALUE, cantidadNum = 0, num;
		
		do {
			System.out.println("Introduce un numero [pulsa 0 para cerrar el programa] intento "+(cantidadNum + 1)+": ");
			num = entrada.nextInt();
			cantidadNum++;
			
			if(cantidadNum == 1){
				minimo = num;
			}
			
			if (num > maximo) {
				maximo = num;
			}
			
			if((num > maximo) && (num != 0)){
				minimo = num;
			}
		} while(num != 0);
		
		if (cantidadNum > 1) {
			System.out.println("Cantidad de numeros leidos: "+(cantidadNum - 1));
			System.out.println("Numero maximo: "+maximo);
			System.out.println("Numero minimo: "+minimo);
		} else {
			System.out.println("No has introducido un numero");
		}
		entrada.close();

	}

}
