package ejercicio5;

public class Main {

	public static void main(String[] args) {
		TarjetaRegalo tarjeta1 = new TarjetaRegalo(27);
		TarjetaRegalo tarjeta2 = new TarjetaRegalo(100);
		TarjetaRegalo tarjeta3 = new TarjetaRegalo();
		
		
		tarjeta3.fusion(tarjeta1, tarjeta2);
		
		System.out.println("Saldo: " + tarjeta3.saldo + " id: " + tarjeta3.id);
		

	}

}
