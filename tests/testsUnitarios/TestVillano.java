package testsUnitarios;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import modelo.Pais;
import modelo.Villano;

class TestVillano {
	@Test
	void obtenerNombreDelVillanoCuandoNoEsNullTest() {
		Villano villano= new Villano("Carmen San Diego", null);
		String nombreEsperado= villano.getNombre();
		assertEquals("Carmen San Diego", nombreEsperado);	
	}
	
	@Test
	
	void obtenerRutaDeEscape_CuandoTieneCeroElementos() {
		Villano villano= new Villano("Carmen San Diego", "Mujer");
		villano.setRutaDeEscape(null);
		assertNull(villano.getPlanDeEscape());
	}
	
	@Test
	void obtenerRutaDeEscape_CuandoTieneUnElemento() {
		Villano villano= new Villano("Carmen San Diego", "Mujer");
		Pais pais= Mockito.mock(Pais.class);
		List<Pais> listaEscape= Arrays.asList(pais);
		villano.setRutaDeEscape(listaEscape);
		assertNotNull(villano.getPlanDeEscape());
	}
	
	@Test
	void obtenerRutaDeEscape_CuandoTieneVariosElemento() {
		Villano villano= new Villano("Carmen San Diego", "Mujer");
		Pais pais= Mockito.mock(Pais.class);
		Pais canada= Mockito.mock(Pais.class);
		Pais australia= Mockito.mock(Pais.class);
		List<Pais> listaEscape= Arrays.asList(pais,australia,canada);
		villano.setRutaDeEscape(listaEscape);
		assertNotNull(villano.getPlanDeEscape());
	}
}
