package ahorcado;

import java.util.*;

public class Ahorcado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random r = new Random();

		String[] palabras = "hola cinco adios treinta java tres".toLowerCase().split(" ");
		boolean seguirJugando;
		int record = Integer.MAX_VALUE;

		do {
			if (record != Integer.MAX_VALUE) {
				System.out.println("El récord es de: " + record + " intentos");
			}
			int quePalabra = r.nextInt(palabras.length);

			String palabra = palabras[quePalabra];

			String aciertos = new String();
			String intentos = new String();
			int nIntentos = 0;
			boolean victoria = false;

			int vidas = 5;
			while (!victoria && vidas >= 0) {
				System.out.println("Número de vidas: " + vidas);
				System.out.println("Aciertos: ");

				for (char i : palabra.toCharArray()) {
					if (aciertos.contains(String.valueOf(i)))
						System.out.print(i + " ");
					else
						System.out.print("_ ");
				}
				System.out.println("\nIntentos: " + intentos);
				System.out.print("Tu intento: ");
				String intentoS = entrada.nextLine().toLowerCase();

				if (intentoS.equals(palabra)) {
					victoria = true;
					nIntentos++;
				} else if (intentoS.length() == 1) {
					char intento = intentoS.charAt(0);
					if ((aciertos + intentos).contains(String.valueOf(intento))) {
						System.out.println("Ya has intentado adivinar la letra " + intento);
						continue;
					} else if (palabra.contains(String.valueOf(intento))) {
						aciertos += intento;
						nIntentos++;
					} else {
						intentos += intento;
						vidas--;
						nIntentos++;
					}

					boolean sonTodos = true;

					for (char i : palabra.toCharArray()) {
						sonTodos = aciertos.contains(String.valueOf(i)) && sonTodos;
					}

					victoria = sonTodos;
				} else {
					System.out.println("Intento de acertar palabra entera incorrecto");
					vidas --;
					nIntentos++;
					continue;
				}
			}

			if (victoria) {
				System.out.println("Enhorabuena!! Has ganado");
				record = record > nIntentos ? nIntentos : record;
			} else {
				System.out.println("Se te han agotado las vidas, la palabra era: " + palabra);
			}

			System.out.print("¿Quieres seguir jugando? (s/n): ");
			char seguir = entrada.nextLine().toLowerCase().charAt(0);
			if (seguir == 's') {
				System.out.println("Comenzando nueva partida");
				seguirJugando = true;
			} else {
				seguirJugando = false;
			}
		} while (seguirJugando);

		entrada.close();
		
		

	}

}
