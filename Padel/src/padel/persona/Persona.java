package padel.persona;

public class Persona {
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
	
	
}
