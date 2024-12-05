package ejerciciosBasicos;

public class Ejercicio1_5 {

	public static void main(String[] args) {
		int a, b, c; 
		a = 5;
		b = 3;
		c = -12;
		boolean evaluacion;
		evaluacion = a >= 3;
		System.out.println("A>3: "+evaluacion);
		evaluacion = a >= c;
		System.out.println("A>C: "+evaluacion);
		evaluacion = a <= c;
		System.out.println("A<C: "+evaluacion);
		evaluacion = b < c;
		System.out.println("B<C: "+evaluacion);
		evaluacion = b != c;
		System.out.println(evaluacion);
		evaluacion = a == 3;
		System.out.println(evaluacion);
		evaluacion = a*b == 15;
		System.out.println(evaluacion);
		evaluacion = c/b == -4;
		System.out.println(evaluacion);
		evaluacion = c/b < a;
		System.out.println(evaluacion);
		evaluacion = c/b == -10;
		System.out.println(evaluacion);
		evaluacion = a%b == 2;
		System.out.println(evaluacion);
		evaluacion = a+b+c == 5;
		System.out.println(evaluacion);
		evaluacion = (a+b == 8) && (a-b == 2);
		System.out.println(evaluacion);
		evaluacion = (a+b == 8) || (a-b == 6);
		System.out.println(evaluacion);
		evaluacion = a > 3 && b > 3 && c < 3;
		System.out.println(evaluacion);
		evaluacion = a > 3 && b >= 3 && c < -3;
		System.out.println(evaluacion);
		
		}

}
