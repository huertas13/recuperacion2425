package fpDual.persona;

public class TutorLaboral extends Tutor {
		private Cargo cargo;
	public TutorLaboral(String nombre, String apellidos, String dni, String email, String cargo) {
		super(nombre, apellidos, dni, email);
		
		setCargo (cargo);	
	
	
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = Cargo.valueOf(cargo);
	}
	
	
}
