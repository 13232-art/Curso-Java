package modelo.animal;

public class Animal {
	
	private String name;
	protected String breed;
	protected int weight;
	
	public Animal(String name, String breed, int weight) {
		super();
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	public Animal() {

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
