package fpDual.documentacion;

public class Empresa implements Contratable, Comparable<Empresa> {

	private String nombre;
	private int cif;
	private int numTrabajadores;
	private String direccion;
	private String localidad;

	public Empresa(String nombre, int cif, int numTrabajadores, String direccion, String localidad) {

		this.nombre = nombre;
		this.cif = cif;
		setNumTrabajadores(numTrabajadores);
		this.direccion = localidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCif() {
		return cif;
	}

	public void setCif(int cif) {
		this.cif = cif;
	}

	public int getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(int numTrabajadores) {

		if (numTrabajadores < 2) {

			throw new IllegalArgumentException("Mínimo tiene que tener 2 trabajadores");
		}

		this.numTrabajadores = numTrabajadores;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public void despedir(int cantidad) {

		if (cantidad <= 0) {

			throw new IllegalArgumentException("La cantidad a despedir debe ser mayor que 0");
		}

		if (this.numTrabajadores - cantidad < 2) {

			throw new IllegalArgumentException("La empresa debe mantener al menos a 2 empleados");

		}

		this.numTrabajadores -= cantidad;

	}

	@Override
	public void contratar(int cantidad) {

		if (cantidad <= 0) {

			throw new IllegalArgumentException("La cantidad debe de ser positiv");

		}

				this.numTrabajadores += cantidad;
	}

	@Override
	public int compareTo(Empresa otra) {
		int compareNum =  Integer.compare(this.numTrabajadores, otra.numTrabajadores);
			if (compareNum == 0) {
				
				
			}
	
	return compareNum;
	
	}

}
