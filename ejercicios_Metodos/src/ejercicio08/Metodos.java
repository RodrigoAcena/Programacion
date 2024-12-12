package ejercicio08;

public class Metodos {
	
	public static int aleatorio(int inicio, int fin) {
		double mRandom = Math.random();
		int randInt = (int) ((fin + 1)*mRandom);
		return inicio + randInt;
	}
}
