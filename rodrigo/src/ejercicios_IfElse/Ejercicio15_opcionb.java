package ejercicios_IfElse;
import java.util.Scanner;

public class Ejercicio15_opcionb {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una hora (formato hh:mm:ss): ");
		String hora = entrada.nextLine();
		
		System.out.print("Introduce una fecha (formato dd/mm/aaaa): ");
		String fecha = entrada.nextLine();
		entrada.close();
		
		//boolean horaFormato = hora.matches("[0-9]{1,2}:[0-9]{1,2}:[0-9]{1,2}");
		
		String[] horaS = hora.split(":");
		String[] fechaS = fecha.split("/");
		
		if (horaS.length == 3 && fechaS.length == 3) {
			int horas, minutos, segundos, dia, mes, anno;
			
			horas = Integer.parseInt(horaS[0]);
			minutos = Integer.parseInt(horaS[1]);
			segundos = Integer.parseInt(horaS[2]);
			
			dia = Integer.parseInt(fechaS[0]);
			mes = Integer.parseInt(fechaS[1]);
			anno = Integer.parseInt(fechaS[2]);
			
			boolean horaB = horas >= 0 && horas < 24;
			boolean minutosB = minutos >= 0 && minutos < 60;
			boolean segundosB = segundos >= 0 && segundos < 60;
			
			boolean diaB = dia > 0 && dia <= 30; // Asumo meses de 30 dias
			boolean mesB = mes > 0 && mes <= 12;
			boolean annoB = anno >= 0;
			
			if (horaB && minutosB && segundosB
					&& diaB && mesB && annoB ) {
				System.out.println("Fecha y hora válidas");
			} else {
				System.out.println("Fecha y/u hora inválidas");
			}
		} else {
			System.out.println("Formato incorrecto");
		}
	}

}

