package ejercicios_Switch;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad en gramos: ");
		double gramo = entrada.nextDouble();
		entrada.nextLine();
		
		if(gramo>=0) {
			System.out.println("Elige a qué convertir:\n"
					+ "1. Kilogramos\n"
					+ "2. Hectogramos\n"
					+ "3. Decagramos\n"
					+ "4. Decigramos\n"
					+ "5. Centigramos\n"
					+ "6. Miligramos");
			System.out.print("Opción: ");
			
			String opcion = entrada.nextLine().trim();
		
			switch(opcion) {
			case "1":
				double kg = gramo/1000;
				System.out.println(kg+"kg");
				break;
			case "2":
				double hg = gramo/100;
				System.out.println(hg+"hg");
				break;
			case "3":
				double dag = gramo/10;
				System.out.println(dag+"dag");
				break;
			case "4":
				double dg = gramo*10;
				System.out.println(dg+"dg");
				break;
			case "5":
				double cg = gramo*100;
				System.out.println(cg+"cg");
				break;
			case "6":
				double mg = gramo*1000;
				System.out.println(mg+"mg");
				break;
			default:
				System.out.println("ERROR: Opcion invalida");
			} 
		}
		else {
			System.out.println("ERROR: El dato tiene que ser positivo");
		}
		entrada.close();

	}

}
