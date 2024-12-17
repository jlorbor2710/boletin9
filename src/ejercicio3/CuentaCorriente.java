package ejercicio3;

public class CuentaCorriente {
	
	
	private String nombre;
	private String dni;
	private double saldo;
	private double limite;
	private Banco banco;

	
	public CuentaCorriente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = 0;
		this.limite = -50;

	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}



	public void IngresarDinero(int dinero) {
		
			saldo += dinero;
	}
	
	public void SacarDinero(int dinero) {
		
		if (limite >= -50) {
			saldo = saldo - dinero;
		}
}
	public void AsociarBanco(Banco banco) {
		this.banco = banco;
	}




	public void MostarInformacion() {
		System.out.println("Nombre del titular: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
        if (banco != null) {
            System.out.println("Banco asociado: " + banco.getNombre() + "\n");
        } else {
            System.out.println("La cuenta no está asociada a ningún banco.\n");
        }
	}



	
	
	
	
	
	

}
