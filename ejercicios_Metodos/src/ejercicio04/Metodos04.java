package ejercicio04;

public class Metodos04 {
	static boolean esPrimo(int a) {
		boolean dividido = false;
		
		for(int i = 2; i < a/2; i++) {
			if(a%i == 0){
				dividido = true;
				break;
			}
			
		}
		
		if(!dividido && a != 1) {
			return true;
		} else {
			return false;
		}
	}
}
