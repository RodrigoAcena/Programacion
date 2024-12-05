package ejercicios_For;

import java.util.*;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random r = new Random(123123);
		
		int inicio = r.nextInt(101);
		
		for(int i = inicio; i >= -100; i -= 7) {
			System.out.println(i);
		}
		entrada.close();

	}

}
