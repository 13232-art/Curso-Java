package modelo.animal;

import interfaz.animal.Pet;

public class Cat extends Animal implements Pet{

	public Cat(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	@Override
    public String showAffection() {
		
		return null;
		
	} 

}
