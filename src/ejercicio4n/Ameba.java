package ejercicio4n;

public class Ameba {
	
	int peso;

	public Ameba(int peso) {
		this.peso = peso;
	}
	public Ameba() {
		this.peso = 3;
	}

	void come(Ameba ameba) {
		this.peso += ameba.peso - 1;
		ameba.peso = 0;
	}
	void come(int peso) {
		this.peso += peso - 1;
	}
	
	

}
