package ejercicio4;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int count = 0;
		String Tamano = null;
		String Tipo = null;
		String Estado = "pedido";
		boolean a = true;
		 do {
			System.out.println("Elige el tamaño de la pizza");
			System.out.println("1.Mediana");
			System.out.println("2.Familiar");
			System.out.println("3.Salir");
			int op = sc.nextInt();
			switch (op) {
			case 1: {
				 Tamano = "Mediana";
				 break;
			}
			case 2: {
				 Tamano = "Familiar";
				 break;
			}
			case 3: {
				 a=false;
					System.out.println("Has pedido " + count + " pizzas");
				 return;
			}
		
			}
				
			
			System.out.println("Elige el tamaño de la pizza");
			System.out.println("1.Pedida");
			System.out.println("2.Servido");
			int op1 = sc.nextInt();
			
			switch (op1) {
			case 1: {
				 Estado = "Pedida";
				 break;
			}
			case 2: {
				 Estado = "Servido";
				 break;
			}
			}
			
			System.out.println("Elige el tipo de la pizza");
			System.out.println("1.Margarita");
			System.out.println("2.4Quesos");
			System.out.println("3.funghi");
			int op2 = sc.nextInt();
			
			switch (op2) {
			case 1: {
				 Tipo = "Margarita";
				 break;
			}
			case 2: {
				 Tipo = "4Quesos";
				 break;
			}
			case 3: {
				 Tipo = "funghi";
				 break;
			}
			
			
			}
			
			count++;
			Pizza pizza1 = new Pizza (Tamano, Tipo, Estado);
			pizza1.MostrarInformación(Tamano, Tipo, Estado);
		} while (a); 
		 
		 
		sc.close();
	

}
	}
