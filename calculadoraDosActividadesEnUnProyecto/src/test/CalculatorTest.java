package test;

import calculadora.Calculator;
import calculadoraParteDos.CalculatorSegundaParte;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(0, null, 0);
        calculator.setOperandOne(10.5);
        calculator.setOperation("+");
        calculator.setOperandTwo(5.2);
        calculator.getResult();
        
        CalculatorSegundaParte ca = new CalculatorSegundaParte(0, null, 0); 
        ca.setOperandOne(10);
        ca.setOperation("+");
        ca.setOperandTwo(5.2);
        ca.performOperation();
        ca.setOperation("*");
        ca.setOperation("=");
        //ca.getResult();
	}

}
