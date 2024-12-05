package ejercicios_For;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		for (int a = 0; a <= 9; a++) {
			String digito1 = (a == 3) ? "E" : String.valueOf(a);
            for (int b = 0; b <= 9; b++) {
            	String digito2 = (b == 3) ? "E" : String.valueOf(b);
                for (int c = 0; c <= 9; c++) {
                	String digito3 = (c == 3) ? "E" : String.valueOf(c);
                    for (int d = 0; d <= 9; d++) {
                    	String digito4 = (d == 3) ? "E" : String.valueOf(d);
                        for (int e = 0; e <= 9; e++) {
                            String digito5 = (e == 3) ? "E" : String.valueOf(e);

                            System.out.println(digito1 + "-" + digito2 + "-" + digito3 + "-" + digito4 + "-" + digito5);
                        }
                    }
                }
            }
        }
		entrada.close();
	}
}

	


