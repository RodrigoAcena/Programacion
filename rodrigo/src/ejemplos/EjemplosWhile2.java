package ejemplos;

import java.util.Scanner;

public class EjemplosWhile2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cuantasE = 0;
		
		String linea;
		
		do {
			System.out.print("Introduce texto: ");
			linea = entrada.nextLine().toLowerCase();
			
			String resto = linea;
			int n = 0;
			
			while (resto.indexOf('e') == -1) {
				int ind = resto.indexOf('e');
				if (ind > -1) {
					cuantasE++;
					resto=resto.substring(ind+1);
				}
				n++;
			}
		} while (!linea.equals(""));
		
		entrada.close();
		
		System.out.println("Hay " + cuantasE + " Es");
	}

}
