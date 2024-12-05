package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una nota: ");
		float nota1 = entrada.nextFloat();
		entrada.nextLine();
		
		System.out.println("Introduce otra nota: ");
		float nota2 = entrada.nextFloat();
		entrada.nextLine();
		
		System.out.println("Introduce una ultima nota: ");
		float nota3 = entrada.nextFloat();
		
		if(nota1 >= 0 && nota2 >= 0 && nota3 >= 0) {
			if(nota1 == 10 && nota2 == 10 && nota3 == 10)
				System.out.println("Matricula de honor");
			}
			else if(nota1 >= 9 && nota2 >= 9 && nota3 >= 9) {
				System.out.println("Beca");
			}
			else if(nota1 >= 8 && nota2 >= 8 && nota3 >= 8) {
				System.out.println("Beca parcial");
			}
			else if(nota1 < 8 && nota2 < 8 && nota3 < 8){
				System.out.println("No tienes beca");
			}
			else {
				System.out.println("Notas invalidas");
		}
		entrada.close();
	}

}
