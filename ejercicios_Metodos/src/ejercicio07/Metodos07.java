package ejercicio07;

public class Metodos07 {

	static final String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	

	public static void abecedario() {
		for (char i = 'A'; i <= 'Z'; i++) {
			for (char j = 'A'; j <= 'Z'; j++) {
				for (char k = 'A'; k <= 'Z'; k++) {
					System.out.println("" + i + j + k);
				}
			}
		}
	}
	
	static void abecedarioNums() {
		int numA = (int) 'A';
		int numZ = (int) 'Z';
		
		for(int i = numA; i <= numZ; i++) {
			for(int j = numA; j <= numZ; j++) {
				for(int k = numA; k <= numZ; k++) {
					char charI = (char) i;
					char charJ = (char) j;
					char charK = (char) k;
					System.out.println(""+charI+charJ+charK);
				}
			}
		}
	}
	static void abecedarioString() {
		for (int i = 0; i < ABC.length(); i++) {
			for (int j = 0; j < ABC.length(); j++) {
				for (int k = 0; k < ABC.length(); k++) {
					System.out.println("" + ABC.charAt(i) + ABC.charAt(j) + ABC.charAt(k));
				}
			}
		}
	}

}
