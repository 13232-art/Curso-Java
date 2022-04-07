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
		
//		int a[] = new int[] { 3, 5, 2,7,9,8,13,25,32 };
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//            sum+=a[i];
//        }
//        System.out.println("Suma arreglo = "+sum);
//        
//		for (int i = 0; i < a.length; i++) {
//			if(a[i]>10) {
//			System.out.println(a[i]);
//			}
//		}
		
		
//		ArrayList<String> nombres = new ArrayList<String>();
//		
//        nombres.add("Nancy");
//        nombres.add("Jinichi");
//        nombres.add("Fujibayashi");
//        nombres.add("Momochi");
//        nombres.add("Ishikawa");
//		
//		Collections.shuffle(nombres);
//		System.out.println(nombres);
//		
//		String n[] = new String[] {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
//	    
//		for (int i = 0; i < n.length; i++) {
//			if(n[i].length()>5) {
//			System.out.println(n[i]);
//			}
//		}
		
		
//		ArrayList<Character> letras = new ArrayList<Character>();
//		
//		letras.add('a');
//		letras.add('b');
//		letras.add('c');
//		letras.add('d');
//		letras.add('e');
//		letras.add('f');
//		letras.add('g');
//		letras.add('h');
//		letras.add('i');
//		letras.add('j');
//		letras.add('k');
//		letras.add('l');
//		letras.add('m');
//		letras.add('n');
//		letras.add('ñ');
//		letras.add('o');
//		letras.add('p');
//		letras.add('q');
//		letras.add('r');
//		letras.add('s');
//		letras.add('t');
//		letras.add('u');
//		letras.add('v');
//		letras.add('w');
//		letras.add('x');
//		letras.add('y');
//		letras.add('z');
//		
//		Collections.shuffle(letras);
//		System.out.println(letras);
//		
//		Character le[] = new Character[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//
//		char ultima = le[le.length-1];
//		System.out.println(ultima);

		
		int[] Arregl = new int[100];
		Random random = new Random();
		int y = 55;
		if(Arregl.length >= y) {
		System.out.println(random.nextInt(100));
		}
        
			//System.out.println(y);
		//for (int y = 55; y <= Arregl.length; y++) {
			//if(y > random.nextInt(56)) {
		   // System.out.println(Arregl[y]);
		//}


       
	
		Collections.shuffle(numeros);

		System.out.println(numeros); // [5, 4, 3, 2, 1]

		Collections.sort(numeros);

		System.out.println(numeros); // [1, 2, 3, 4, 5]

		Random r = new Random();

		System.out.println(r.nextInt()); // Sin límites

		System.out.println(r.nextInt(5)); // Con límites entre 0 y 5

	}

}
 