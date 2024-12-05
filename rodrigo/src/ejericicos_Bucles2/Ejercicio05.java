package ejericicos_Bucles2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
        System.out.print("Introduce una cadena: ");
        String cadena = entrada.nextLine().toLowerCase();;
        
        boolean tieneVocal = false;
        
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                tieneVocal = true;
                break; 
            }
        }
        
        if (tieneVocal) {
            System.out.println("La cadena tiene vocal.");
        } else {
            System.out.println("La cadena no tiene vocal.");
        }
        
        entrada.close();

	}

}
