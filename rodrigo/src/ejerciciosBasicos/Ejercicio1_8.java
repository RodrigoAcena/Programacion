package ejerciciosBasicos;

public class Ejercicio1_8 {

	public static void main(String[] args) {
		int variableA = 45;
		boolean multiplos = true;
		multiplos = variableA%2 == 0;
		System.out.println(multiplos ? "Par" : "Impar");
		multiplos = variableA%2 == 0 && variableA%3 == 0;
		System.out.println(multiplos ? "Cumple con las condiciones" : "No cumple con las condiciones");

	}

}
