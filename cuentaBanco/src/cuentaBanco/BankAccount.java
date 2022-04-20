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
		
		if(numeroCuenta!=0) {
			numeroCuenta = (int) (Math.random()*10+1);
		}else {
			System.out.println("No permita que retire dinero si tiene fondos insuficientes");
		}
		return numeroCuenta;
		
	}
	
	public double cuentaCorriente() {
		return saldoCuentaCorriente;
	}
	
	public double cuentaAhorro() {
		return saldoCuentaAhorro;
	}
}
