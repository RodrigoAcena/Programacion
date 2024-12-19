package ejercicio11;

public class Metodos11 {

	public static String cifrar(String cadena, int desfase) {
		String codex = new String();
		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			char nuevo = (char) (letra + desfase);
			codex += ""+nuevo;
		}
		return codex;
	}
}
