package maestroDeObjetosParteDos;

import maestroDeObjetos.Human;

public class Ninja extends Human{

	public Ninja(int strength, int intelligence, int stealth, int health) {
		super(strength, intelligence, stealth, health);
		
	}

	public void steal() {
		System.out.println("roba la cantidad de puntos que tenga el Ninja en stealth de la salud del otro Human y los agrega a la health del Ninja");
	}
	
	public void runAway() {
		System.out.println("reduce su salud en 10");
	}
	
}
