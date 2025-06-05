package padel.instalaciones;



public class Pista implements Reservable{
	
	private int numPista;
	private Tipo tipoPista;
	private Ubicacion ubicacionPista;
	private boolean reservada;
	
	public Pista(int numPista, String tipoPista, String ubicacionPista) {
		setNumPista(numPista);
		setTipoPista(tipoPista);
		setUbicacionPista(ubicacionPista);
	}
	
	public int getNumPista() {
		return this.numPista;
	}
	
	public void setNumPista(int numPista) {
		if(numPista < 1) {
			throw new IllegalArgumentException("El número de pista debe ser un entero positivo. ");
		}
		this.numPista = numPista;
	}
	
	public String getTipoPista() {
		return this.tipoPista.toString();
	}
	
	public void setTipoPista(String tipoPista) {
		this.tipoPista = Tipo.valueOf(tipoPista);
	}
	
	public String getUbicacionPista() {
		return this.ubicacionPista.toString();
	}
	
	public void setUbicacionPista(String ubicacionPista) {
		this.ubicacionPista = Ubicacion.valueOf(ubicacionPista);
	}

	
	@Override
	public void reservar() {
		
		if(this.reservada) {
			
			throw new IllegalArgumentException("La pista ya está reservada");
			
		}
			
		
		
	}

	@Override
	public void anular() {
		if (!this.reservada) {
			
			throw new IllegalArgumentException("La pista no se puede anular");
			
		}
		
	}

}