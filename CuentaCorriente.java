

public class CuentaCorriente extends CuentaBancaria {
	
	
	@Override
	public void deposito(double dinero) {
		if (dinero>0 && dinero <=1000) {
			dinero += (dinero*0.01);
			saldo = dinero;
		}else {
			saldo += dinero;
			
		}
	}	
}
