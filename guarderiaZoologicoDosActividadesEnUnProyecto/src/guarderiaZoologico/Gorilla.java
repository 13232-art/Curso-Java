package guarderiaZoologico;

public class Gorilla extends Mammal{
	

	public Gorilla(int energyLevel) {
		super(energyLevel);
		
	}

	public void throwSomething() {
		System.out.println("El gorila ha lanzado algo, al mismo tiempo que disminuye su nivel de energ�a en 5");
	}
	
    public void eatBananas() {
        System.out.println("El gorila tiene mejor energia e incremento su nivel de energ�a en 10");
    }
	
    public void climb() {
        System.out.println("El gorila ha trepado a la cima de un �rbol y disminuye su nivel de energ�a en 10");
    }
}
