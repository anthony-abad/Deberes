import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {	
	
	static double sueldop = 400;
	static ArrayList<String> empleados = new ArrayList<>();
	public static void contratar() {
		System.out.println("SELECCIONE EL TIPO DE EMPLEADO QUE DESEA CONTRATAR: ");
		System.out.println("1. OFICINISTA");
		System.out.println("2. SUPERVISOR TECNICO");
		System.out.println("3. GERENTE");
		System.out.println("4. SALIR");
		Scanner entrada = new Scanner (System.in);
		int opcion = entrada.nextInt();
		switch(opcion) {
		case 1: contrataOficinista(); contratar();break;
		case 2: contrataSupervisorTecnico (); contratar();break;
		case 3: contrataGerente (); contratar();break;
	}
	}
	

	public static void contrataOficinista () {
		System.out.println("LA EMPRESA HA CONTRATADO UN OFICINISTA");
		empleados.add("OFICINISTA");
	}
	public static void contrataSupervisorTecnico () {
		System.out.println("LA EMPRESA HA CONTRATADO UN SUPERVISOR TECNICO");
		empleados.add("SUPERVISOR TECNICO");
	}
	public static void contrataGerente () {
		System.out.println("LA EMPRESA HA CONTRATADO UN GERENTE");
		empleados.add("GERENTE");
	}
		
		

}


