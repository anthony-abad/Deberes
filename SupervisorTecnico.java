
public class SupervisorTecnico extends Empleado{

	private int anhostrabajados;
	
	public SupervisorTecnico(String nombre, String apellido, int edad,double salario, int anhosTrabajados) {
		super(nombre, apellido, edad, salario);
		this.anhostrabajados = anhosTrabajados;
	}
	
	public int getAnhostrabajados() {
		return anhostrabajados;
	}


	public void setAnhostrabajados(int anhostrabajados) {
		this.anhostrabajados = anhostrabajados;
	}

	@Override
	public double getSalario() {
		double salario = super.getSalario();
		double aumento;
		aumento = ((salario*0.05)*anhostrabajados);
		return salario+aumento;
		
	}



}
