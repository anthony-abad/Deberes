
public abstract class CuentaBancaria {
	
	private String propietario;
	protected  double saldo;
	
	public abstract void deposito(double dinero);
	
	
	public void retiro(double dinero) {
		if (dinero>0 && saldo>dinero) {
			saldo -= dinero;
		}else {
			System.out.println("Su saldo es insuficiente");			
		}
	}
	
	public String getPropietario() {
		return propietario;
	}


	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}




}
