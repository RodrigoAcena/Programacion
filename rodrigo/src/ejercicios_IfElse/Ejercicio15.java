package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una hora (formato hh:mm:ss): ");
		String hora = entrada.nextLine();
		
		System.out.print("Introduce una fecha (formato dd/mm/aaaa): ");
		String fecha = entrada.nextLine();
		entrada.close();
		
		boolean formatoFCorr = false;
		boolean formatoHCorr = false;
		
		int horas, minutos, segundos;
		horas = minutos = segundos = 0;
		
		int dia, mes, anno;
		dia = mes = anno = 0;
		
		int dosP = hora.indexOf(':');
		
		if (dosP >= 0) {
			horas = Integer.parseInt(hora.substring(0, dosP));
			String resto = hora.substring(dosP + 1);
			int dosP2 = resto.indexOf(':');
			
			if (dosP2 >= 0) {
				minutos = Integer.parseInt(resto.substring(0, dosP2));
				segundos = Integer.parseInt(resto.substring(dosP2 + 1));
				formatoHCorr = true;
			}
		}
		
		int par = fecha.indexOf('/');
		
		if (par >= 0) {
			dia = Integer.parseInt(fecha.substring(0, par));
			String resto = fecha.substring(par + 1);
			int par2 = resto.indexOf('/');
			
			if (par2 >= 0) {
				mes = Integer.parseInt(resto.substring(0, par2));
				anno = Integer.parseInt(resto.substring(par2 + 1));
				formatoFCorr = true;
			}
		}
		
		if (formatoFCorr && formatoHCorr) {
			boolean horaC = (horas >= 0 && minutos >= 0 && segundos >= 0);
			horaC = horaC && horas < 24 && minutos < 60 && segundos < 60;
			boolean fechaC = (dia > 0 && mes > 0 && anno >= 0);
			fechaC = fechaC && dia <= 30 && mes <= 12;
			
			if (horaC && fechaC) {
				System.out.println("Fecha y hora correctas");
			} else System.out.println("Fecha y/u hora incorrectas");
		} else {
			System.out.println("Formato Incorrecto!!");
		}
	}
}

