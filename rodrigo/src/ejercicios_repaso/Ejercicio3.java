package ejercicios_repaso;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce numero 1: ");
		double horas = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Introduce numero 2: ");
		double minutos = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Introduce numero 3: ");
		double segundos = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Elige una opción de conversion:\n"
				+ "\t1. Horas\n"
				+ "\t2. Minutos\n"
				+ "\t3. Segundos\n");
		System.out.print("Opción: ");
		int opcion = entrada.nextInt();
		entrada.close();
		
		switch(opcion) {
		case 1:
			double m_h = minutos/60;
			double s_h = (segundos/60)/60;
			double suma1 = horas+m_h+s_h;
			System.out.println("Horas: "+suma1);
			break;
		case 2:
			double h_m = horas*60;
			double s_m = segundos/60;
			double suma2 = minutos+h_m+s_m;
			System.out.println("Minutos: "+suma2);
			break;
		case 3:
			double h_s = (horas*60)*60;
			double m_s = minutos*60;
			double suma3 = segundos+h_s+m_s;
			System.out.println("Segundos: "+suma3);
			break;
		default:
			System.out.println("Opcion invalida");
		}

	}

}
