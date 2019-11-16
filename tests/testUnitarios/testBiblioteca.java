package testUnitarios;
import org.junit.Test;
import org.mockito.Mockito;
import Lugares.Biblioteca;
import modelo.Caso;
import modelo.Pais;
import modelo.Villano;

public class testBiblioteca {

	@Test
	public void darPista_CuandoElVillanoPasoPorAhi() {
		Villano villanito = Mockito.mock(Villano.class);
		Biblioteca bibliotecaNacional = new Biblioteca();
		Pais pais=Mockito.mock(Pais.class);
		Pais doblePais=Mockito.mock(Pais.class);
		pais.agregarConexionAerea(doblePais);
		doblePais.setCaracteristicas("tiene montanias");
		doblePais.setCaracteristicas("su bandera tiene una luna");
		doblePais.setCaracteristicas("hay camellos raros");
		villanito.agregarPaisAlaRutaDeEscape(pais);
		villanito.agregarPaisAlaRutaDeEscape(doblePais);
		villanito.agregarSeniasParticulares("tiene ojos pequeños");
		villanito.agregarSeniasParticulares("uñas super largas");
		villanito.agregarHobbies("le gusta leer en sus tiempos libres");
		bibliotecaNacional.setPaisDeOrigenDelLugar(pais);
		bibliotecaNacional.setVillanoEstuvoAqui(true);
		Caso caso=Mockito.mock(Caso.class);
		bibliotecaNacional.darPista(caso);	
	}
	@Test
	public void darPista_CuandoElNOVillanoPasoPorAhi() {
		Villano villanito = Mockito.mock(Villano.class);
		Biblioteca bibliotecaNacional = new Biblioteca();
		Pais pais=Mockito.mock(Pais.class);
		Pais doblePais=Mockito.mock(Pais.class);
		pais.agregarConexionAerea(doblePais);
		doblePais.setCaracteristicas("tiene montanias");
		doblePais.setCaracteristicas("su bandera tiene una luna");
		doblePais.setCaracteristicas("hay camellos raros");
		villanito.agregarPaisAlaRutaDeEscape(pais);
		villanito.agregarPaisAlaRutaDeEscape(doblePais);
		villanito.agregarSeniasParticulares("tiene ojos pequeños");
		villanito.agregarSeniasParticulares("uñas super largas");
		villanito.agregarHobbies("le gusta leer en sus tiempos libres");
		bibliotecaNacional.setPaisDeOrigenDelLugar(pais);
		bibliotecaNacional.setVillanoEstuvoAqui(false);
		Caso caso=Mockito.mock(Caso.class);
		try {
			bibliotecaNacional.darPista(caso);
		}
		catch (Exception NoHayPistasException){}		
	}
	/*
	 * El RANDOM NO LO PUDE TESTEAR
	 * 
	 * */
	
}
