package test.SoftwareMonitoreo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TestMonitoreo {

	@Test
	public void queSePuedaCrearUnAuto() {
		
		Auto auto = new Auto("ACD 201", 5, 150.0, 450.0, 340.0);
		
		String resultadoEsperado = "ACD 201";
		
		String resultadoObtenido = auto.getPatente();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void queSePuedaCrearUnaMoto() {
		
		Moto moto = new Moto("BDP 304", 2, 150.0, 450.0, 340.0);
		
		String resultadoEsperado = "BDP 304";
		
		String resultadoObtenido = moto.getPatente();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void queSePuedaCrearUnaBici() {
		
		Bicicleta bici = new Bicicleta("KLM 124", 1, 30.0, 450.0, 340.0);
		
		Double resultadoEsperado = 450.0;
		Double resultadoEsperado2 = 340.0;
		
		Double resultadoObtenido = bici.getLatitud();
		Double resultadoObtenido2 = bici.getLongitud();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		assertEquals(resultadoEsperado2, resultadoObtenido2);
		
	}
	
	@Test
	public void queSePuedaCrearUnTren() {
		
		Tren tren = new Tren("AJ 1800", 150, 200.0, 450.0, 340.0);
		
		Double resultadoEsperado = 450.0;
		Double resultadoEsperado2 = 340.0;
		
		Double resultadoObtenido = tren.getLatitud();
		Double resultadoObtenido2 = tren.getLongitud();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		assertEquals(resultadoEsperado2, resultadoObtenido2);
		
	}
	
	@Test
	public void queSePuedanIncorporarDistintosVehiculos() throws ColitionException {
		
		Mapa actual = new Mapa("Buenos Aires");
		
		Auto auto = new Auto("ACD 201", 5, 150.0, 450.0, 340.0);
		Auto auto2 = new Auto("ABF 581", 5, 150.0, 300.0, 200.0);
		Auto auto3 = new Auto("ABF 389", 5, 150.0, 150.0, 140.0);
		Auto auto4 = new Auto("ACD 541", 5, 150.0, 225.0, 340.0);
		Tren tren = new Tren("AJ 1800", 150, 200.0, 210.0, 265.0);
		Moto moto = new Moto("BDP 304", 2, 150.0, 460.0, 312.0);
		Moto moto2 = new Moto("BCA 561", 2, 150.0, 321.0, 349.0);
		Moto moto3 = new Moto("BDD 201", 2, 150.0, 217.0, 216.0);
		Bicicleta bici = new Bicicleta("KLM 124", 1, 30.0, 180.0, 180.0);
		Bicicleta bici2 = new Bicicleta("KLO 100", 1, 30.0, 170.0, 170.0);
		
		actual.agregarVehiculo(auto);
		actual.agregarVehiculo(auto2);
		actual.agregarVehiculo(auto3);
		actual.agregarVehiculo(auto4);
		actual.agregarVehiculo(tren);
		actual.agregarVehiculo(moto);
		actual.agregarVehiculo(moto2);
		actual.agregarVehiculo(moto3);
		actual.agregarVehiculo(bici);
		actual.agregarVehiculo(bici2);
		
		Integer resultadoEsperado = 10;
		Integer resultadoObtenido = actual.getListaVehiculos();
		
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		assertFalse(actual.hayColision());
		
		
		
		
		
	}
	
	
	
	
	
	
}
