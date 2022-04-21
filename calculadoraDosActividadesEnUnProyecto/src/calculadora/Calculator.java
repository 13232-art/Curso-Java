package calculadora;

public class Calculator{

	protected double operandOne;
	protected String operation;
	protected double operandTwo;
	
	public Calculator(double operandOne, String operation, double operandTwo) {
		super();
		this.setOperandOne(operandOne);
		this.operation = operation;
		this.operandTwo = operandTwo;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public void performOperation() {
		double result;
		result = (operandOne  * operandTwo)+10.5;
		System.out.println(result);
	}
	
	public void getResult() {
		double resultado;
		resultado = operandOne  + operandTwo;
		System.out.println(resultado);
	}

		
}
