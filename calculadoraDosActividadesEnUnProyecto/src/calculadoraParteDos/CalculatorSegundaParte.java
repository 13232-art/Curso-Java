package calculadoraParteDos;

import calculadora.Calculator;

public class CalculatorSegundaParte extends Calculator implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	public CalculatorSegundaParte(double operandOne, String operation, double operandTwo) {
		super(operandOne, operation, operandTwo);
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
	
	
	@Override
	public void performOperation() {
		double result;
		result = (operandOne  * operandTwo)+10.5;
		System.out.println(result);
	}
	
	@Override
	public void getResult() {
		double resultado;
		resultado = operandOne + operandTwo;
		System.out.println(resultado);
	}
	
}
