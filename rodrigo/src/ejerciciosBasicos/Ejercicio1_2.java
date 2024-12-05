package ejerciciosBasicos;

public class Ejercicio1_2 {

	public static void main(String[] args) {
		byte comprimido = 43;
		char letter = 'a';
		short enano = 88;
		int num1 = 123;
		long longer = 8734572L;
		float simple = 385.5f;
		double complicated = 364.9978346592687532d;
		
		int suma = (int) (simple + complicated);
		int resta = enano - comprimido;
		int producto = (int) (longer * num1);
		int division = (int) (simple / letter);
		int resto = num1 % enano;
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(producto);
		System.out.println(division);
		System.out.println(resto);
		
		// TODO Auto-generated method stub

	}

}
