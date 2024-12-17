package ejercicio6;

public class Incidencia {
	int codigo;
	int estado;
	private static int contador = 1;
	
	public Incidencia(int estado) {
		this.estado = estado;
		incremenatrcontador();
	}
	
	public Incidencia() {
		incremenatrcontador();
	}
	
	private void incremenatrcontador() {
		this.codigo = contador++;
	}
	
	void AbrirIncidencia() {
		
	}
	void ResolverIncidencia() {
		
	}
	
}

