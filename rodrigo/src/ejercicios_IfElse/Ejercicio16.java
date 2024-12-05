package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una hora (formato hh:mm:ss): ");
		String hora = entrada.nextLine();
		
		System.out.print("Introduce una fecha (formato dd/mm/aaaa): ");
		String fecha = entrada.nextLine();
		entrada.close();
		
		String[] horaS = hora.split(":");
		String[] fechaS = fecha.split("/");
		boolean formatoC = true;
		
		if (horaS.length == 3 || fechaS.length == 3) {
			int h, m, s, d, mes, a, numDias;
			
			h = Integer.parseInt(horaS[0]);
			m = Integer.parseInt(horaS[1]);
			s = Integer.parseInt(horaS[2]);
			
			d   = Integer.parseInt(fechaS[0]);
			mes = Integer.parseInt(fechaS[1]);
			a   = Integer.parseInt(fechaS[2]);
			
		numDias = 31;
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				numDias = 30;
			} else if (mes == 2) {
				// boolean bis = (a % 4 == 0 && a % 100 != 0) || a % 400 == 0;
				numDias = a % 4 == 0 ? 29 : 28;
			}
			
			if (!(h >= 0 && m >= 0 && s >= 0 && d > 0 && mes > 0 && a > 0
					&& h < 24 && m < 60 && s < 60 && d <= numDias && mes <= 12))
				formatoC = false;
		} else formatoC = false;
		
		if (formatoC) System.out.println("Formato correcto");
		else System.out.println("Formato incorrecto");
	}
}
