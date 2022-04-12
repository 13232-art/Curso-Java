package test;

import guarderiaZoologico.Bat;
import guarderiaZoologico.Gorilla;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla(100);
        gorilla.displayEnergy();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.climb();
        
        Bat bat = new Bat(300);
        bat.displayEnergy();
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.fly();
        
	}

}
