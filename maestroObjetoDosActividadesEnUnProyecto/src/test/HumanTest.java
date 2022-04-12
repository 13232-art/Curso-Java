package test;

import maestroDeObjetos.Human;
import maestroDeObjetosParteDos.Ninja;
import maestroDeObjetosParteDos.Samurai;
import maestroDeObjetosParteDos.Wizard;

public class HumanTest {

	public static void main(String[] args) {
		Human human = new Human(3,3,3,100);
        human.attack();
        
        Wizard wizard = new Wizard(0,8,0,50);
        
        Ninja ninja = new Ninja(0,0,10,0);
        
        Samurai samurai = new Samurai(0,0,0,200);
	}

}
