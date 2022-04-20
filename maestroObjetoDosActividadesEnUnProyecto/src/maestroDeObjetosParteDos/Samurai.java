package maestroDeObjetosParteDos;

import maestroDeObjetos.Human;

public class Samurai extends Human {

	public Samurai(int strength, int intelligence, int stealth, int health) {
		super(strength, intelligence, stealth, health);

	}

	public void deathBlow() {
		System.out.println("asesina al otro Human y reduce la health del Samurai a la mitad");
	}
	
	public void meditate() {
		System.out.println("se curará al Samurai en la mitad de puntos que tenga de health");
	}
	
	public void howMany() {
		System.out.println("devuelve cuantos Samurai tenemos actualmente");
	}

}
