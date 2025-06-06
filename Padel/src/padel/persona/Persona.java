package padel.persona;

public abstract class Persona implements Comparable<Persona> {
	//Atributos
	private String nombre;
	private String apellidos;
	private String dni;
	
	//Constructor
	public Persona(String nombre, String apellidos, String dni) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	
	}
	
	public String getDni() {
		
		return this.dni;
		
	}

	public void setDni(String dni) {
		
		this.dni = dni;
		
		if(dni == null || dni.length() < 9) {
			
			throw new IllegalArgumentException("El dni debe tener exactamente 9 caracteres");
			
		}
		
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	
	public boolean equals (Object obj) {
		
		if (obj == null) {
			
			return false;
		}
	
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		
		Persona otra = (Persona) obj;
		boolean iguales = false;
		if (this.dni == otra.dni) {
			iguales = true;
		}
	
	return iguales;
	}
	
	public void saludar() {
		
		System.out.println("Hola soy " + getNombre() + getApellidos() + "y soy " + getClass() );
}



	@Override
	
	public int compareTo (Persona o) {
		
		
		
		
		
		
		
	}






}
