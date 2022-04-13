package cuentaBanco;

public class BankAccount {
	
	private int numeroCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaAhorro;
	
	private static int cuentasCreadas = 0;
	private static int rastrearDineroAlmacenado = 0;
	
	
	public BankAccount(int numeroCuenta, double saldoCuentaCorriente, double saldoCuentaAhorro) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldoCuentaCorriente = saldoCuentaCorriente;
		this.saldoCuentaAhorro = saldoCuentaAhorro;
		cuentasCreadas++;
	}




	public double getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}



	public double getSaldoCuentaAhorro() {
		return saldoCuentaAhorro;
	}


	public int numerosAleatorios() {
		numeroCuenta = (int) (Math.random()*10+1);
		return numeroCuenta;
		
	}
}
