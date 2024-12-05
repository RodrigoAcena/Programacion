package ejercicios_For;

public class Ejercicio22 {

	public static void main(String[] args) {
		System.out.println("Los números perfectos entre 1 y 1000 son:");
		
		for(int i = 1; i <= 1000; i++) {
			int suma = 0;
			for(int j = 1; j<i; j++) {
				if (i%j == 0) {
					suma += j;
				}
			}	
			if(suma==i) {
				System.out.println(i);;
			}
		}

	}

}
