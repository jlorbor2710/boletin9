package ejercicio4n;

public class Main {

	public static void main(String[] args) {
		Ameba ameba1 = new Ameba ();
		Ameba ameba2 = new Ameba ();
		
		ameba1.come(ameba2);
		ameba2.come(5);
		
		System.out.println(ameba1.peso);
		System.out.println(ameba2.peso);

	}

}
