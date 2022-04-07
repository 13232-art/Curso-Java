package listaExcepciones;

import java.util.ArrayList;

public class ClassCastException {

	public static void main(String[] args) {

		ArrayList<Object> myList = new ArrayList<Object>();
		try {
			myList.add("13");

			myList.add("Hola Mundo");

			myList.add(48);

			myList.add("Adios Mundo");
		} catch (Exception e) {
			for (int i = 0; i < myList.size(); i++) {

				int castedValue = (int) myList.get(i);
				System.out.println(castedValue);
				System.out.println(e);
			}

		}
		

	}

}
