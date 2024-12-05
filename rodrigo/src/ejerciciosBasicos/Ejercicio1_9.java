package ejerciciosBasicos;

public class Ejercicio1_9 {

	public static void main(String[] args) {
		int maybe = -33;
		boolean multiplos = true;
		multiplos = (maybe%3 == 0 || maybe%7 == 0) && maybe >= 0;
		System.out.println(multiplos ? "Cumple con las condiciones" : "No cumple con las condiciones");

	}

}
