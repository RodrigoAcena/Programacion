package ejercicio07;

public class Metodos {

	public static void abecedario() {
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
}
