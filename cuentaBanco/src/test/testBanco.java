package test;

import cuentaBanco.BankAccount;

public class testBanco {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount(3, 8, 6);
        System.out.println(bank.numerosAleatorios());
	}

}
