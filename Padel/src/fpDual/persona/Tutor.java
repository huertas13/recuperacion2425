package fpDual.persona;

public abstract class Tutor extends Persona {
	private String email;
	public Tutor(String nombre, String apellidos, String dni, String email) {
		super(nombre, apellidos, dni);
		
		this.email = email;
	
	
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public boolean equals (Object obj) {
		
		if(obj == null) {
			
			return false;
		}
	
	if (!this.getClass().equals(obj.getClass())) {
		
		return false;
	}
	
	Tutor otro = (Tutor) obj;
	
	return super.equals(otro) && this.email.equals(otro.email);
	
	
	}

		


}
