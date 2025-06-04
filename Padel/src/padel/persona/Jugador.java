package padel.persona;

public abstract class Jugador extends Persona {

		// Atributos
		private int codSocio;
	
	public Jugador(String nombre, String apellidos, String dni, int codSocio) {
		super(nombre, apellidos, dni);
		this.codSocio = codSocio;

}


	public boolean equals (Object obj) {
		
		if (obj == null) {
			
			return false;
			
		}
		
		if (!this.getClass().equals(obj.getClass())) {
			
			return false;
			
		}
	
		Jugador otro = (Jugador) obj;
	
	
		boolean iguales = false;
		
		if (super.equals(obj) && (this.codSocio == otro.codSocio)) {
			
			iguales = true;
			
		}
			return iguales;
	
	}



}