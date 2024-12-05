package ejerciciosBasicos;

public class Ejercicio1_11 {

	public static void main(String[] args) {
		short cortoA,cortoB;
		long largoA,largoB;
		largoA= Long.MAX_VALUE;
		largoB= Long.MIN_VALUE;
		
		cortoA = (short)largoA;
		cortoB = (short)largoB;
		
		System.out.printf("El valor %d se ha convertido en %d%n", largoA, cortoA);
		System.out.printf("El valor %d se ha convertido en %d%n", largoB, cortoB);

	}

}
