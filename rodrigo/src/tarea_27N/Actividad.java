package tarea_27N;

import java.util.Scanner;

public class Actividad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcion;
		int contador = 1;
		
		do {
			System.out.println("1. Media aritmética"+
					"\n2. Media ponderada"+
					"\n3. Correcion de examen"+
					"\n4. Salir");
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();
		
			switch(opcion) {
			case 1:
				int suma = 0;
				int num;
				int contarNotas = 0;
				do {
					System.out.println("Introduce los numeros (para salir introduzca -1):");
					num = entrada.nextInt();
					entrada.nextLine();
					suma += num;
					contarNotas++;
				} while(num != -1);
				System.out.println("Media: "+(suma/contarNotas));
				break;
			case 2:
				int sumaNotas = 0;
				int sumaPond = 0;
				int nota;
				int ponderacion;
				do {
					System.out.println("Introduce la nota "+contador+": ");
					nota = entrada.nextInt();
					entrada.nextLine();
					System.out.println("Introduce la ponderacion (hasta que sume 100): ");
					ponderacion = entrada.nextInt();
					entrada.nextLine();
					sumaNotas += nota;
					sumaPond += ponderacion;
					contador++; //Se que se podria haber hecho con 'for', pero me di cuenta tarde y me dio pereza
				} while(sumaPond < 100);
				if(sumaPond == 100) {
					System.out.println("Media: "+(sumaNotas*(sumaPond/100)));
				} else {
					System.out.println("ERROR: La ponderacion tiene que ser 100");
				}
				break;
			case 3:
				int sumaEjercicio = 0;
				int sumaAlumno = 0;
				int notaEjercicio;
				int notaAlumno;
				System.out.println("Introduce la nota total: ");
				int notaMax = entrada.nextInt();
				entrada.nextLine();
				do {
					System.out.println("Introduce la nota maxima del ejercicio "+contador+": ");
					notaEjercicio = entrada.nextInt();
					entrada.nextLine();
					System.out.println("Introduce la nota del alumno: ");
					notaAlumno = entrada.nextInt();
					sumaEjercicio += notaEjercicio;
					sumaAlumno += notaAlumno;
					contador++; //Se que se podria haber hecho con 'for', pero me di cuenta tarde y me dio pereza
				} while(sumaEjercicio < notaMax);
				if(sumaEjercicio == notaMax) {
					System.out.println("Nota: "+sumaAlumno+"/"+notaMax);
				} else {
					System.out.println("AVISO: La suma de notas maximas son mayores que la nota del examen");
					System.out.println("Nota: "+sumaAlumno+"/"+sumaEjercicio);
				}
			case 4:
				break;
			default:
				System.out.println("Opcion incorrecta. Seleciona un numero entre 1 y 4.");
			}
		} while(opcion != 4);
		entrada.close();

	}

}
