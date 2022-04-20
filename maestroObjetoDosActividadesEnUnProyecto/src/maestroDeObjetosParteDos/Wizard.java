package maestroDeObjetosParteDos;

import maestroDeObjetos.Human;

public class Wizard extends Human{

	public Wizard(int strength, int intelligence, int stealth, int health) {
		super(strength, intelligence, stealth, health);
		
	}
	
	public void heal() {
		System.out.println("se aumentará la salud del otro Human en los puntos de intelligence que tenga el Wizard");
	}
	
	public void fireBall() {
		System.out.println("se disminuye la salud del otro Human en los puntos de intelligence * 3 que tenga el Wizard");
	}


}
