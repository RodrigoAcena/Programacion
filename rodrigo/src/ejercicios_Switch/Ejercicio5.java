package ejercicios_Switch;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println();
		String mes = entrada.nextLine();
		entrada.close();
		
		switch(mes) {
		case "Febrero":
			System.out.println(mes+"= 28/29 dias");
		case "Abril": case "Junio": case "Septiembre": case "Noviembre":
			System.out.println(mes+"= 30 dias");
		case "Enero": case "Marzo": case "Mayo": case "Julio": case "Agosto": case "Octubre": case "Diciembre":
			System.out.println(mes+"= 31 dias");
		default:
			System.out.println("ERROR");
		}

	}

}
