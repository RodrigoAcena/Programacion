package ejerciciosBasicos;

public class Ejercicio1_1 {

	public static void main(String[] args) {
		int num1 = 65;
		double xd = 3.14;
		char charI = 'e';
		
		System.out.println("Entero: " + num1);
		System.out.println("Doble " + xd);
		System.out.println("Caracter " + charI);
		double suma = num1 + xd;
		double resta = xd - num1;
		int conversion = (int)charI; //conversion cast
		System.out.println("Entero+Doble= " + suma);
		System.out.println("Doble-Entero= " + resta);
		System.out.println("El numero del char es: " + conversion);
		
		// TODO Auto-generated method stub

	}

}
