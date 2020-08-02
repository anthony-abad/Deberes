import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		CuentaCorriente cc1 = new CuentaCorriente();
		CuentaAhorro ca1 = new CuentaAhorro();
		
		
		cc1.setPropietario("Anthony");
		System.out.println("Bienvenido Sr. "+cc1.getPropietario());
		System.out.println("Ingrese el valor que desea depositar en su Cuenta Corriente: ");
		Scanner cantidad = new Scanner (System.in);
		int dinero = cantidad.nextInt();
		cc1.deposito(dinero);
		System.out.println("Sr. "+cc1.getPropietario()+" Su Saldo De La Cuenta Corriente es: "+cc1.getSaldo());
		
		
		
		ca1.setPropietario("Roberto");
		System.out.println("Bienvenido Sr. "+ca1.getPropietario());
		System.out.println("Ingrese el valor que desea depositar en su Cuenta de Ahorro: ");
		Scanner valor = new Scanner (System.in);
		int dineroa = valor.nextInt();	
		ca1.deposito(dineroa);
		System.out.println("Sr. "+ca1.getPropietario()+" Su Saldo De La Cuenta Ahorro es: "+ca1.getSaldo());

	}

}
