package maestroDeObjetos;

public class Human {

	private int strength;
	private int intelligence;
	private int stealth;
	private int health;
	
	public Human(int strength, int intelligence, int stealth, int health) {
		super();
		this.strength = strength;
		this.intelligence = intelligence;
		this.stealth = stealth;
		this.health = health;
	}
	
	public int getHealth() {
		return health;
	}

	public int getStrength() {
		return strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getStealth() {
		return stealth;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void attack() {
	   System.out.println("se disminuirá la salud de cualquiera que sea atacado en la cantidad de puntos de Strength que tenga el atacante");	
	}
	
}
