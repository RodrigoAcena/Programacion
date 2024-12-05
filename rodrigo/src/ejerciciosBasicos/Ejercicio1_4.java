package ejerciciosBasicos;

public class Ejercicio1_4 {

	public static void main(String[] args) {
		int variableA, variableB, variableC, variableD;
		variableA = 55;
		variableB = 73;
		variableC = 92;
		variableD = 23;
		System.out.printf("A: %d; B: %d; C: %d; D: %d", variableA, variableB, variableC, variableD);
		
		int aux;
		aux = variableA;
		variableA = variableB;
		variableB = variableC;
		variableC = variableD;
		variableD = aux;
		System.out.printf(" A: %d; B: %d; C: %d; D: %d", variableA, variableB, variableC, variableD);		
	}

}
