package ejercicio10;

public class Metodos10 {
	
	public static boolean esEntero(String cadena) {
		if(cadena.isEmpty()) {
			return false;
		}
		char primero = cadena.charAt(0);
		if(primero != '+' && primero != '-') {
			return false;
		}
		for(int i = 1; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
		
	}
}
