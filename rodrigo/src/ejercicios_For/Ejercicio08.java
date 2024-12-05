package ejercicios_For;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un binario de 8 cifras: ");
		String binario = entrada.nextLine();
		
		if(binario.length() <= 8){
			boolean valido = true;
			int decimal = 0;
			
			for(int i = 0; i < binario.length(); i++) {
				char charI = binario.charAt(binario.length()-i-1);
				if(charI=='1') {
					decimal += (int) Math.pow(2, i);
				} else if(charI=='0'){
					continue;
				} else {
					valido = false;
					break;
				}
			}
			if(valido) {
				System.out.println("El numero es: "+decimal);
			} else {
				System.out.println("Solo puedes introducir 0s y 1s");
			}
			
		}
		else {
			System.out.println("El numero es muy largo");
		}
		entrada.close();
	}

}
