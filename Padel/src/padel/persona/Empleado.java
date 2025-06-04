package padel.persona;

public class Empleado extends Persona {

	private int codEmpleado;
public Empleado(String nombre, String apellidos, String dni, int codEmpleado) {
		super(nombre, apellidos, dni);
		this.codEmpleado = codEmpleado;
	}

	@Override 
	public String toString() {
		return String.format("Soy el empleado: %S, %S, %d", getNombre(), getApellidos(), this.codEmpleado);

		
	}

}
