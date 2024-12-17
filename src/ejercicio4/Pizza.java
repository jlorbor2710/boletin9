package ejercicio4;

public class Pizza {

	private String tamaño;
	private String tipo;
	private String estado;
	
	public Pizza(String tamaño, String tipo, String estado) {
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.estado = estado;
	}
	public void MostrarInformación(String tamaño, String tipo, String estado) {
		System.out.println("Tamaño: " + tamaño);
	    System.out.println("Tipo: " + tipo);
	    System.out.println("Estado: " + estado);	
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
}
