package ejercicios_While;

import java.util.*;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random rand = new Random();
		
		int respNum;
		int num = rand.nextInt(100);
		
		do {
			System.out.println("Introduce un numero (1-100): ");
			respNum = entrada.nextInt();
			if(respNum>num) {
				System.out.println("Menor");
			} else if(respNum<num) {
				System.out.println("Mayor");
			}
			
		}
		while(respNum != num);
		if(respNum == num) {
			System.out.println("¡¡Has ganado!!");
		}
		entrada.close();
	}

}
