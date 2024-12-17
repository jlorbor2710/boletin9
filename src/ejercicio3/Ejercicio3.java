package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {

        Banco banco1 = new Banco("Banco Central");


        CuentaCorriente cuenta1 = new CuentaCorriente("Jose tomas", "54354577A");
		CuentaCorriente cuenta2 = new CuentaCorriente("Jose manuel", "54235577F");
		CuentaCorriente cuenta3 = new CuentaCorriente("Antonio", "25254577C");


        cuenta1.AsociarBanco(banco1);
        cuenta3.AsociarBanco(banco1);

        // Operaciones
        cuenta1.IngresarDinero(200);
        cuenta1.SacarDinero(300); 

        banco1.setDireccion("Nueva Calle 456");

        
        cuenta1.MostarInformacion();
        cuenta2.MostarInformacion();
        cuenta3.MostarInformacion();
	}
}
