package ejercicio08;

public class Metodos08 {
	
	/**
	 * ESTE MÉTODO DEVUELVE UN NÚMERO ENTRE UN INTERVALO [INICIO - FIN]
	 * @param inicio
	 * @param fin
	 * @return int
	 */
	
	public static int aleatorio(int inicio, int fin) {
        double mRandom = Math.random(); // mRandom > 0, mRandom < 1
        int randInt = (int) ((fin - inicio + 1)*mRandom);
        return inicio + randInt;
	}
}
