package ejerciciosBasicos;

public class Ejercicio1_10 {

	public static void main(String[] args) {
		int variableA = 38;
		boolean Bars = true;
		Bars = variableA%5 == 0;
		System.out.println(Bars ? "Multiplo" : "No multiplo");
		Bars = variableA%10 == 0;
		System.out.println(Bars ? "Multiplo" : "No multiplo");
		Bars = (variableA > 100 != (variableA == 100 != variableA < 100));
		System.out.println(Bars ? 0 : "No se cumplen las condiciones");

	}

}
