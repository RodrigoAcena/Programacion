package ejercicios_For;

import java.util.Scanner;

public class Ejercicio_prueba03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String frase, fragmento;
		
		System.out.println("Frase: ");
		frase = entrada.nextLine();
		System.out.println("Fragmento: ");
		fragmento = entrada.nextLine();
		entrada.close();
		
		int lon = fragmento.length();
		int cuenta = 0; 
		for(int i = 0; i <= frase.length()-lon; i++) {
			String trozo1 = frase.substring(i, i+lon);
			
			if(trozo1.equals(fragmento)) cuenta++;
		}
		
		System.out.println(cuenta);

	}

}