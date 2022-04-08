package test;

import proyectoClase.Project;

public class ProjectTest {

	public static void main(String[] args) {
		Project elevatorPitch = new Project("Pia", "en formacion");
		String nombre = elevatorPitch.getNombre();
		System.out.print(nombre);
		System.out.print(":");
		String descripcion = elevatorPitch.getDescripcion();
		System.out.print(descripcion);
	}

}
