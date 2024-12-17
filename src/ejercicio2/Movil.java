package ejercicio2;
import java.text.*;
public class Movil {

	String numero;
	String tarifa;
	int tiempo;
	double costePorMinuto;
	double minutos;
	double total;
	DecimalFormat formateador = new DecimalFormat("0.00");

	
	public Movil(String numero, String tarifa) {
		this.numero = numero;
		this.tarifa = tarifa;
	}
	public void llama(Movil m, int i) {
		this.tiempo += i;
		m.tiempo += i;
		minutos = tiempo / 60.0	;
		
		
		switch (this.tarifa) {
        case "rata":
            costePorMinuto = 0.06;
            total = (tiempo*costePorMinuto)/60;
            break;
        case "mono":
            costePorMinuto = 0.12;
            total = (i*costePorMinuto)/60;
            break;
        case "bisonte":
            costePorMinuto = 0.30;
            break;
        default:
            throw new IllegalArgumentException("Tarifa no válida: " + this.tarifa);
            
            
    }

	}
	
	public String toString() {
		return "Nº "+ numero + " -" + tiempo + "s de conversación" + " tarificados " + formateador.format(total);
	}
	

	
	
}
