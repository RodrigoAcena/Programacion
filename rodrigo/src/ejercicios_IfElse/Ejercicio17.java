package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una fecha (formato dd/mm/aaaa): ");
		String fecha = entrada.nextLine();
		System.out.print("Introduce una otra (formato dd/mm/aaaa): ");
		String fecha2 = entrada.nextLine();
		entrada.close();
		
		String[] fechaS = fecha.split("/");
		String[] fecha2S = fecha2.split("/");
		
		boolean correcto = false;
		int d1, m1, a1, d2, m2, a2;
		d1 = m1 = a1 = d2 = m2 = a2 = -1;
		
		if (fechaS.length == 3 || fecha2S.length == 3) {			
			d1 = Integer.parseInt(fechaS[0]);
			m1 = Integer.parseInt(fechaS[1]);
			a1 = Integer.parseInt(fechaS[2]);
			
			d2 = Integer.parseInt(fecha2S[0]);
			m2 = Integer.parseInt(fecha2S[1]);
			a2 = Integer.parseInt(fecha2S[2]);
			
			if (d1 > 0 && d2 > 0 && m1 > 0 && m2 > 0 && a1 > 0 && a2 > 0
					&& d1 <= 30 && d2 <= 30 && m1 <= 12 && m2 <= 12)
				correcto = true;
		}
		
		int dd, md, ad;
		dd = md = ad = 0;
		
		if (correcto) {
			ad = a1 < a2 ? a2 - a1 : a1 - a2;
			md = m1 < m2 ? m2 - m1 : m1 - m2;
			dd = d1 < d2 ? d2 - d1 : d1 - d2;
			
			int diff = dd + 30*md + 365*ad;
			System.out.println("La diferencia es de " + diff + " dias");
			System.out.println("O de " + dd + " dias " + md + " meses y " + ad + " años");
		} else System.out.println("Fechas incorrectas");
	}
}
