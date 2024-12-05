package ejemplos;

public class EjemploIfElse {

	public static void main(String[] args) {
		int edad = 20;
		
		if (edad >= 18) {
			System.out.println("Mayor de edad");
		} else if (edad >= 15) {
			System.out.println("Menor de edad, mayor de 15");
		} else {
			System.out.println("Niño");
		}
	}

}
