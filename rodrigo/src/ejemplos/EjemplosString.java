package ejemplos;

public class EjemplosString {

	public static void main(String[] args) {
		String s = new String("Ñ");
		String t = new String("Hola buenas tardes");
		int n = 56;
		String ns = String.valueOf(n);
		
		System.out.println( t.charAt(t.length() - 1) ); // ultimo char
		
		System.out.println(t.equals(s));
		System.out.println(t.equalsIgnoreCase(s));
		System.out.println(s.compareTo(t));
		
		System.out.println(t.substring(5,11));
		System.out.println(ns);
		
		System.out.println(t.replaceAll("buenas", "malas"));
		t = t.replaceAll("buenas", "malas");
		System.out.println(t.indexOf("e"));
		System.out.println(t.indexOf("e", 8));
		System.out.println(t.lastIndexOf("e"));
		
		System.out.println(t.startsWith("Hola") ? "Hola" : "Maleducado");
		System.out.println(t.toUpperCase());
		
		String mail = "dviver@fundacionmontessori.com  " + (-1 % 5);
		System.out.println(mail);
		
		String[] mailS = mail.split("@");
		char[] ta = t.toCharArray();
		
		ta[0] = 'h';
		
		System.out.println(ta);
		
		System.out.println("" + 3 + 3);
		
		/*
		 * 
		 * int -> Integer
		 * double -> Double
		 * boolean -> Boolean
		 */
		
		String numero = "100010011";
		
		int entero = Integer.parseInt(numero, 2);
		
		System.out.println(entero);
	}
}
