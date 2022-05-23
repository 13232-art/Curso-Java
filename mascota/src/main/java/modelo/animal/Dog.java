package modelo.animal;

import interfaz.animal.Pet;

public class Dog extends Animal implements Pet{
	
	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		if (weight < 30) {
			System.out.println("have them hop into your lap!");
		} else if (weight >= 30) {
			System.out.println("have them curl up next to you");
		}
		return null;
		
		

	}
}
