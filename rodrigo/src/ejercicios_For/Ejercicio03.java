package ejercicios_For;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int numMayor = entrada.nextInt();
		int numMenor;
		do {
			System.out.println("Introduce un numero menor que "+numMayor+": ");
			numMenor = entrada.nextInt();
		} while(numMenor >= numMayor);
		
		int incremento;
		int diferencia = numMayor - numMenor;
		
		do {
			System.out.println("Introduce un incremento (menor o igual que "+diferencia+"): ");
			incremento = entrada.nextInt();
		} while((incremento < 0 ? -incremento : incremento) > diferencia || incremento == 0);
		
		int inicio = incremento < 0 ? numMayor : numMenor;
		int fin = incremento < 0 ? numMenor : numMayor;
		
		for (int i = inicio; incremento < 0 ? i >= fin : i <= fin; i += incremento) {
			System.out.print(i+" ");
		}
		entrada.close();

	}

}
