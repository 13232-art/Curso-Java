package test;

import guarderiaZoologico.Gorilla;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla(100);
        gorilla.displayEnergy();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.climb();
	}

}
