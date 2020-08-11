
public class Gerente extends SupervisorTecnico {
	
	private double viaticos;
	
	public Gerente(String nombre, String apellido, int edad, double salario, int anhosTrabajados, double viaticos) {
		super(nombre, apellido, edad, salario, anhosTrabajados);
		this.viaticos = viaticos;
		
	}

	@Override
	public double getSalario() {
		return super.getSalario()+viaticos;
		
	}



	
	
	

	

	
	

}
