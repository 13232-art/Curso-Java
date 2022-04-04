package test;

import manipulacionCadenas.StringManipulator;

public class StringManipulatorTest {
	
	public static void main(String[] args) {
		
		 
		StringManipulator manipulator = new StringManipulator();

		String str = manipulator.trimAndConcat("    Hola     ", "     Mundo    ");
		System.out.println(str.trim());
		
		StringManipulator manipulator1 = new StringManipulator();

		char letter = 'n';
		int a = manipulator1.getIndexOrNull("NTT Data", letter);
		int b = manipulator1.getIndexOrNull("Hola Mundo", letter);
		int c = manipulator1.getIndexOrNull("Saludar", letter);

		System.out.println(a); 
		System.out.println(b); 
		System.out.println(c); 
		
		StringManipulator manipulator2 = new StringManipulator();

		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";

		int a1 = manipulator2.getIndexOrNull(word, (char) subString.indexOf("rd"));
		int b1 = manipulator2.getIndexOrNull(word, (char) notSubString.indexOf("no se ha encontrado"));

		System.out.println(a1);
		System.out.println(b1); 
		
		StringManipulator manipulator3 = new StringManipulator();

		String word1 = manipulator3.concatSubstring("Hola", 1, 3, "mundo");
		System.out.println(word1);
		
	}
}
