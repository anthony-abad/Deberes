
public class Main extends Empresa{
	
	
	
	public static void main(String[] args) {
	Empleado ofi1 = new Oficinista("Anthony", "Abad", 50, 420);
	Empleado ofi2 = new Oficinista("Roberto", "Moreira", 20, 430);

	System.out.println(ofi1.getSalario());
	System.out.println(ofi2.getSalario());
	
	Empleado spt1 = new SupervisorTecnico("Joffre", "Tite", 54,2000, 2);
	Empleado spt2 = new SupervisorTecnico("Carlos", "Ramirez", 21,150, 4);
	
	System.out.println(spt1.getSalario());
	System.out.println(spt2.getSalario());
	
	Empleado gr1 = new Gerente("Juan", "Moreira", 61, 2050, 5, 250);
	Empleado gr2 = new Gerente("Graciela", "Moreira", 60, 3500, 6, 350);
	
	System.out.println(gr1.getSalario());
	System.out.println(gr2.getSalario());
	
	Empresa empresa = new Empresa ();
	empresa.contratar(ofi1);
	empresa.contratar(ofi2);
	empresa.contratar(spt1);
	empresa.contratar(spt2);
	empresa.contratar(gr1);
	empresa.contratar(gr2);
	
	System.out.println(empresa.totalEmpleados());
	System.out.println(empresa.diaDePago());
	
}
}
