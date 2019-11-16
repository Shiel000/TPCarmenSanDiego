package testUnitarios;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import Lugares.LugarDeInteres;
import excepciones.NoHaySiguientePaisException;

import modelo.Pais;
import modelo.Villano;

public class testVillano {

	@Test
	public void esElUltimoElementoDeLaLista_CuandoHayUnElemento() {
		Pais africa =new Pais("africa");
		LugarDeInteres lugar= Mockito.mock(LugarDeInteres.class);
		Villano villanin = new Villano("villanin", "masculino",lugar);
		villanin.agregarPaisAlaRutaDeEscape(africa);
		boolean esUltimo= villanin.esElUltimoElementoDeLaLista(africa, villanin.getRutaDeEscape());
		assertTrue(esUltimo);
		
	}
	@Test
	public void esElUltimoElementoDeLaLista_CuandoHayMasDeUnElemento() {
		Pais africa =new Pais("africa");
		Pais marruecos =new Pais("marruecos");
		Pais lituania =new Pais("lituania");
		Pais polonia =new Pais("polonia");
		LugarDeInteres lugar= Mockito.mock(LugarDeInteres.class);
		Villano villanin = new Villano("villanin", "masculino",lugar);
		villanin.agregarPaisAlaRutaDeEscape(africa);
		villanin.agregarPaisAlaRutaDeEscape(marruecos);
		villanin.agregarPaisAlaRutaDeEscape(lituania);
		villanin.agregarPaisAlaRutaDeEscape(polonia);
		boolean esUltimo= villanin.esElUltimoElementoDeLaLista(polonia, villanin.getRutaDeEscape());
		assertTrue(esUltimo);
	}
	@Test 
	public void buscoElProximoIndiceDelProximoPais_CuandoHayProximoPais() {
		Pais africa =new Pais("africa");
		Pais marruecos =new Pais("marruecos");
		Pais lituania =new Pais("lituania");
		Pais polonia =new Pais("polonia");
		LugarDeInteres lugar= Mockito.mock(LugarDeInteres.class);
		Villano villanin = new Villano("villanin", "masculino",lugar);
		villanin.agregarPaisAlaRutaDeEscape(africa);
		villanin.agregarPaisAlaRutaDeEscape(marruecos);
		villanin.agregarPaisAlaRutaDeEscape(lituania);
		villanin.agregarPaisAlaRutaDeEscape(polonia);
		int indiceDelSiguiente=villanin.buscoElProximoIndiceDelProximoPais(marruecos);
		assertEquals(2,indiceDelSiguiente);
		/*ACLARACION IMPORTANTE
		 *EL VECTOR EMPIEZA EN 0 ,POR LO QUE CUANDO LE "SUMO 1 "
		 *TENGO QUE TENER EN CUENTA ESE DETALLE 
		 * */
	}
	@Test(expected = NoHaySiguientePaisException.class)
	public void buscoElProximoIndiceDelProximoPais_CuandoNOHayProximoPais() {
		Pais africa =new Pais("africa");
		Pais polonia =new Pais("polonia");
		LugarDeInteres lugar= Mockito.mock(LugarDeInteres.class);
		Villano villanin = new Villano("villanin", "masculino",lugar);
		villanin.agregarPaisAlaRutaDeEscape(africa);
		villanin.agregarPaisAlaRutaDeEscape(polonia);
		villanin.buscoElProximoIndiceDelProximoPais(polonia);
	}
	@Test 
	public void obtenerSeniaParticular_CuandoHayUnElemento() {
		LugarDeInteres lugar= Mockito.mock(LugarDeInteres.class);
		Villano dororo= new Villano("Dororo", "mujer", lugar);
		dororo.agregarSeniasParticulares("es pequeña");
		String senia =dororo.obtenerSeniaParticular();
		assertEquals("es pequeña",senia);
	}
	@Test
	public void obtenerSeniaParticular_CuandoHayUnMASDeUnElemento() {
		LugarDeInteres lugar= Mockito.mock(LugarDeInteres.class);
		Villano dororo= new Villano("Dororo", "mujer", lugar);
		dororo.agregarSeniasParticulares("es pequeña");
		dororo.agregarSeniasParticulares("supero es marron oscuro");
		dororo.agregarSeniasParticulares("es palida y le gusta comer");		
		String senia =dororo.obtenerSeniaParticular();
		assertNotNull(senia);
	}
	@Test
	public void obtenerHobbies_CuandoHayUnElemento() {
		LugarDeInteres lugar= Mockito.mock(LugarDeInteres.class);
		Villano dororo= new Villano("Dororo", "mujer", lugar);
		dororo.agregarHobbies("le gusta viajar");
		String hobbies = dororo.obtenerHobbies();
		assertEquals("le gusta viajar",hobbies);
	}
	
	
	@Test
	public void obtenerHobbies_CuandoHayMASDeUnElemento() {
		LugarDeInteres lugar= Mockito.mock(LugarDeInteres.class);
		Villano dororo= new Villano("Dororo", "mujer", lugar);
		dororo.agregarHobbies("le gusta viajar");
		dororo.agregarHobbies("caza demonios junto a su hermano");
		dororo.agregarHobbies("comer hasta reventar");
		dororo.agregarHobbies("buscar nuevos tesoros para robar");
		String hobbie =dororo.obtenerHobbies();
		assertNotNull(hobbie);
	}
	
	@Test
	
	public void obtenerCaracteristicaDelProximoPais_CuandoHayPRoximoPais() {
		Pais africa =new Pais("africa");
		Pais polonia =new Pais("polonia");
		LugarDeInteres lugar= Mockito.mock(LugarDeInteres.class);
		Villano villanin = new Villano("villanin", "masculino",lugar);
		villanin.agregarPaisAlaRutaDeEscape(africa);
		villanin.agregarPaisAlaRutaDeEscape(polonia);
		polonia.setCaracteristicas("bandera banca y roja");
		String caracteristica=villanin.obtenerCaracteristicaDelProximoPais(africa);
		assertEquals("bandera banca y roja",caracteristica);
		
	}
	
	@Test(expected = NoHaySiguientePaisException.class)
	public void obtenerCaracteristicaDelProximoPais_CuandoNOHayPRoximoPais() {
		Pais africa =new Pais("africa");
		Pais polonia =new Pais("polonia");
		LugarDeInteres lugar= Mockito.mock(LugarDeInteres.class);
		Villano villanin = new Villano("villanin", "masculino",lugar);
		villanin.agregarPaisAlaRutaDeEscape(africa);
		villanin.agregarPaisAlaRutaDeEscape(polonia);
		villanin.obtenerCaracteristicaDelProximoPais(polonia);
	}
	
	
}
