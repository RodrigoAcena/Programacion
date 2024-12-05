package ejericicos_Bucles2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un entero: ");
		String entero = entrada.nextLine();
		String digitos = new String();
		
		String todosLosNum = "0123456789";
		for(int i = 0; i < entero.length(); i++){
			char c = entero.charAt(i);
			if(Character.isDigit(c)){
				digitos += c;
			}
		}
		System.out.print("Digitos que aparecen: ");
		for(int i = 0; i < digitos.length(); i++){
			System.out.print(digitos.charAt(i)+" ");
		}
		System.out.println();
		System.out.print("Digitos que no aparecen: ");
		for(int i = 0; i < 10; i++){
			if(!digitos.contains(""+todosLosNum.charAt(i))){
				System.out.print(i +"");
			}
		}
		System.out.println();
		entrada.close();

	}

}
