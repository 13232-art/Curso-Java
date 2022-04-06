package rompecabeza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(3);

		numeros.add(5);

		numeros.add(1);

		numeros.add(2);

		numeros.add(7);
		
		numeros.add(9);
		
		numeros.add(8);
		
		numeros.add(13);
		
		numeros.add(25);
		
		numeros.add(32);

		Collections.shuffle(numeros);

		System.out.println(numeros); // [5, 4, 3, 2, 1]

		Collections.sort(numeros);

		System.out.println(numeros); // [1, 2, 3, 4, 5]

		Random r = new Random();

		System.out.println(r.nextInt()); // Sin límites

		System.out.println(r.nextInt(5)); // Con límites entre 0 y 5

	}

}
