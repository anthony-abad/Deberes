
public class CuentaAhorro extends CuentaBancaria{

	public void deposito(double dinero) {
		if (dinero>0 && dinero <=1000) {
			dinero += (dinero*0.02);
			saldo = dinero;
		}else {
			saldo += dinero;
			
		}	
	}
	}


