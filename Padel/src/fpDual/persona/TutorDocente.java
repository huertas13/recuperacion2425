package fpDual.persona;

public class TutorDocente extends Tutor{
	private Especialidad especialidad;
	public TutorDocente(String nombre, String apellidos, String dni, String email, String especialidad) {
		super(nombre, apellidos, dni, email);
		
		
		
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		
		
		
		this.especialidad = Especialidad.valueOf(especialidad);
		
	}

	
	
}
