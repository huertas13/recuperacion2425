package fpDual.persona;

public abstract class Persona {

	// Atributos
	private String nombre;
	private String apellidos;
	private String dni;
	// Constructor
	
	public Persona(String nombre, String apellidos, String dni) {
		
	
		this.apellidos = apellidos;
		this.nombre = nombre;
		setDni(dni); //Cuando tiene validacion se pone así
		
				
	
	
	
	
	}

	// getters y setters 
	
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		
		if (dni.length() != 9) {
			
			throw new IllegalArgumentException("DNI no válido");
		}
		
		this.dni = dni;
	}


	
	// Metodos
	
	public void saludar() {
		
		System.out.println("Hola soy " + getNombre() + "y soy " + getClass());
		
		
		
	}
		
	
	@Override
	public boolean equals (Object obj) {
			
			
			if (obj == null) {
				
				return false;
			}
			
			
			if (!obj.getClass().equals(obj.getClass())) {
				
				return false;
			
			}
				
				
			
			Persona otra = (Persona) obj;
			
			return this.dni.equals(otra.getDni());
			
			
		}
		

}
