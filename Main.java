import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Empresa{
	
	static double gastototal = 0;
	public static void diaDePago(ArrayList<String> empleados) {
		int indice = 0;
		int i=0;
		
		while (indice < empleados.size()) {
			double salario=0;
			if (empleados.get(i) == "OFICINISTA") {
				salario = sueldop;
				System.out.println("EMPLEADO: "+i+ " USTED ES OFICINISTA" );
				System.out.println("SU SALARIO ES: "+ salario);
			}else if(empleados.get(i) == "SUPERVISOR TECNICO") {
				System.out.println("EMPLEADO: "+i+ " USTED ES SUPERVISOR TECNICO");
				System.out.println("INGRESE LOS A�OS DE TRABAJO");
				Scanner entrada = new Scanner (System.in);
				int a�os = entrada.nextInt();
				salario = sueldop + ((sueldop*0.05)*a�os);
				System.out.println("SU SALARIO ES: "+ salario);
			}else {
				System.out.println("EMPLEADO: "+i+ " USTED ES GERENTE");
				System.out.println("INGRESE LOS A�OS DE TRABAJO");
				Scanner entrada = new Scanner (System.in);
				int a�os = entrada.nextInt();
				System.out.println("INGRESE EL VALOR DE BONO FIJO POR VI�TICOS");
				Scanner ingreso = new Scanner (System.in);
				int bonofijo = ingreso.nextInt();
				salario = sueldop + ((sueldop*0.05)*a�os)+ bonofijo;
				System.out.println("SU SALARIO ES: "+ salario);
			}
			indice++;
			i++;
			gastototal += salario;
		}
			
	}
	
	public static void main(String[] args) {
		contratar();
		diaDePago(empleados);
		System.out.println("EL VALOR TOTAL QUE DEBE CANCELAR LA EMPRESA A LOS EMPLEADOS ES DE: $"+gastototal+ " DOLARES");


}
}
