package test.SoftwareMonitoreo;

public class Vehiculo {

	private String patente;
	private Integer cantidadMaximaPasajeros;
	private Double velocidad;
	private Double latitud;
	private Double longitud;

	public Vehiculo(String patente, Integer cantidadMaximaPasajeros, Double velocidad, Double Latitud, Double Longitud) {
		this.patente = patente;
		this.cantidadMaximaPasajeros = cantidadMaximaPasajeros;
		this.velocidad = velocidad;
		this.latitud = Latitud;
		this.longitud = Longitud;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getCantidadMaximaPasajeros() {
		return cantidadMaximaPasajeros;
	}

	public void setCantidadMaximaPasajeros(Integer cantidadMaximaPasajeros) {
		this.cantidadMaximaPasajeros = cantidadMaximaPasajeros;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	
	
	
	
}
