package ejericicos_Bucles2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
        System.out.print("Introduce una cadena: ");
        String cadena = entrada.nextLine().toLowerCase();;
        
        
        int vocales = 0;
        int novocales = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++; 
            } else {
            	novocales++;
            }
        }
        System.out.println("Cantidad de letras que son vocales: "+vocales);
        System.out.println("Cantidad de letras que no son vocales: "+novocales);
        
        entrada.close();

	}

}
