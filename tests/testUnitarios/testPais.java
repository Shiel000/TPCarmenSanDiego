package testUnitarios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Pais;

class testPais {

	@Test
	void tieneConxionAerea_CuandoAmbosEstanCotectados() {
		Pais argentina = new Pais("argentina");
		Pais chile = new Pais("chile");
		argentina.agregarConexionAerea(chile);
		boolean estanConectados = argentina.tieneConexionAereaCon(chile);
		assertTrue(estanConectados);
		/*
		 * UNA ACLARACION IMPORTANTE EN ESTE TEST ME DECIA QUE 
		 * "java.lang.NULLPointerExpretion
		 * bueno eso pasa por que en mi clase pais el vector "conexionesAereas" no teneia el new
		 * es decir queira guardar el pais en un vector que no existia o no habia creado
		 * puede ser que en otras clases pase lo mismo asi que ojo con eso!
		 * */
	}
	@Test
	void tieneConxionAerea_CuandoAmbosNOEstanCotectados() {
		Pais argentina = new Pais("argentina");
		Pais chile = new Pais("chile");
		Pais brasil = new Pais("brasil");
		argentina.agregarConexionAerea(brasil);
		boolean estanConectados = argentina.tieneConexionAereaCon(chile);
		assertFalse(estanConectados);
	}
	
	@Test
	void obtenerCaracteristicaDelPais_CuandotengoUnElementoEnLaLista() {
		Pais argentina= new Pais("argentina");
		argentina.setCaracteristicas("toman mate");
		String carcteristicaDelPais =argentina.obtenerCaracteristicaDelPais();
		assertEquals("toman mate", carcteristicaDelPais);
	}
	/*
	 * PREGUNTAR COMO SE PUEDE HACER CON MAS PISTAS
	 * ESTO ES DEBIDO QUE COMO LE PODES PEQGAR AL RANDOM
	 * 
	 * */
	

}
