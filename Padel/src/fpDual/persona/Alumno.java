package fpDual.persona;

public class Alumno extends Persona {
	private String numSeguridad;
	public Alumno(String nombre, String apellidos, String dni, String numSeguridad) {
		super(nombre, apellidos, dni);
		
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			
			return false;
		}
		
		if (!this.getClass().equals(obj.getClass())) {
			
			return false;
		}
		
		Alumno otro = (Alumno) obj;
	
		return super.equals(otro) && this.numSeguridad.equals(otro.numSeguridad);
	
	
	
	}
		
	@Override
	public String toString () {
			return String.format("Alumno: nombre =%d, apellidos= %s, dni= %s, numSS= %s", this.getNombre(), this.getApellidos(), this.numSeguridad);
			
			
		}
	

}
