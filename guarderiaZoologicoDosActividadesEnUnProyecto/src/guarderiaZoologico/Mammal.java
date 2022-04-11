package guarderiaZoologico;

public class Mammal {
	
	private int energyLevel;
	

	public Mammal(int energyLevel) {
	 this.energyLevel = energyLevel;	
	}


	public int getEnergyLevel() {
		return energyLevel;
	}


	public void displayEnergy() {
		System.out.println(getEnergyLevel());
	}
	
}
