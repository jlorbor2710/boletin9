package ejercicio5;

public class TarjetaRegalo {

	int saldo;
	int id;
	
	public TarjetaRegalo(int saldo) {
		this.saldo = saldo;
		this.id = (int) (10000 + Math.random() * 90000);
	}
	public TarjetaRegalo() {
		this.id = (int) (10000 + Math.random() * 90000);
	}
	
	void fusion(TarjetaRegalo tarjeta1, TarjetaRegalo tarjeta2) {
		this.saldo = tarjeta1.saldo + tarjeta2.saldo;
		tarjeta1.saldo = 0;
		tarjeta2.saldo = 0;
	}
	
	

}
