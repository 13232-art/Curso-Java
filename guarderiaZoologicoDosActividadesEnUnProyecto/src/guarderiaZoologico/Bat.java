package guarderiaZoologico;

public class Bat extends Mammal{
	
	public Bat(int energyLevel) {
		super(energyLevel);
	}

	public void fly(){
	   System.out.println("El Bat emite un sonido al despegar y disminuye su nivel de energía en 50");
	}
	
	public void eatHumans() {
	   System.out.println("“bueno, no importa” e incrementar su nivel de energía en 25");
	}
	
	public void attackTown() {
	   System.out.println("El sonido de la ciudad en llamas y disminuye su nivel de energía en 100");
	}
	
}
