package test.SoftwareMonitoreo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mapa{

	private String ciudad;
	private List<Vehiculo> listaVehiculos;

	public Mapa(String ciudad) {
		this.ciudad = ciudad;
		listaVehiculos = new ArrayList<Vehiculo>();
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		listaVehiculos.add(vehiculo);
	}

	public Integer getListaVehiculos() {
		return listaVehiculos.size();
	}
	// retorna true siempre
	public Boolean hayColision() throws ColitionException {
		Boolean hayColision = false;
			for (int i = 1; i < listaVehiculos.size(); i++) {
				for (int j = 0; j < listaVehiculos.size() - 1; j++) {
					if(listaVehiculos.get(i).getLatitud() == listaVehiculos.get(j).getLatitud() &&
							listaVehiculos.get(i).getLongitud() == listaVehiculos.get(j).getLongitud()) {
								hayColision = true;
									throw new ColitionException();
					}
				}
			}
		return hayColision;
	}
	
	
	
	
	
	
}
