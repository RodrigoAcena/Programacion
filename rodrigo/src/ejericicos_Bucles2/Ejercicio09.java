package ejericicos_Bucles2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		int numAlumnos = 0;
		
		do {
			System.out.print("Número de alumnos: ");
			numAlumnos = entrada.nextInt();
		} while (numAlumnos <= 0);
		
		double pagoAlumno = 0, pagoBus = 0;
		
		if (numAlumnos >= 100) {
			pagoAlumno = 65;
			pagoBus = numAlumnos * pagoAlumno;
		} else if (numAlumnos >= 50 && numAlumnos <= 99) {
			pagoAlumno = 70;
			pagoBus = numAlumnos * pagoAlumno;
		} else if (numAlumnos >= 30 && numAlumnos <= 99) {
			pagoAlumno = 95;
			pagoBus = numAlumnos * pagoAlumno;
		} else {
			pagoBus = 4000;
			pagoAlumno = pagoBus/numAlumnos;
		}

		System.out.printf("El coste del autobús es de " + pagoBus + " euros"
				+ "\ny cada alumno debe pagar " + df.format(pagoAlumno) + " euros.");
		
		entrada.close();

	}

}
