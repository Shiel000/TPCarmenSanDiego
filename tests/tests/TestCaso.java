package tests;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import modelo.Caso;
import modelo.Pais;

class TestCaso {

	@Test
	public void setPlanDeEscape_CuandoPlanDeEscapeEsNulo() {
		Caso caso=new Caso();
		caso.setPlanDeEscapeDelSospechoso(null);
		assertNull(caso.getPlanDeEscapeDelSospechoso());
	
	}
	@Test
	public void setPlanDeEscape_CuandoPlanDeEscapeTieneUnElemento() {
		Caso caso = new Caso();
		Pais pais=Mockito.mock(Pais.class);
		List<Pais> paisEscape= Arrays.asList(pais);
		caso.setPlanDeEscapeDelSospechoso(paisEscape);
		assertNotNull(caso.getPlanDeEscapeDelSospechoso());
		
	}
	@Test
	public void setPlanDeEscape_CuandoPlanDeEscapeContieneMasDeUnElemento() {
		Caso caso = new Caso();
		Pais argentinaMock = Mockito.mock(Pais.class);
		Pais chinaMock = Mockito.mock(Pais.class);
		Pais italiaMock = Mockito.mock(Pais.class);
		List<Pais> plan=Arrays.asList(argentinaMock, chinaMock, italiaMock);
		caso.setPlanDeEscapeDelSospechoso(plan);
		assertEquals(caso.getPlanDeEscapeDelSospechoso(), plan);
	}
	
	@Test
	public void setPaisOrigen() {
		Caso caso=new Caso();
		Pais argentinaMock = Mockito.mock(Pais.class);
		caso.setPaisDondeOcurrioElCrimen(argentinaMock);
		assertEquals(caso.getPaisDondeOcurrioElCrimen(),argentinaMock);
	}
	

}
