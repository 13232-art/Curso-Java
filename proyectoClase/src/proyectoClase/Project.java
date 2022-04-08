package proyectoClase;

public class Project {

	private String nombre;
	private String descripcion;
	
	public Project() {
		
	}
	
	public Project(String name) {
		this.nombre = name;

	}
	
	public Project(String name, String description) {
		this.nombre = name;
		this.descripcion = description;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
