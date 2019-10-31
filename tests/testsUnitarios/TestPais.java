package testsUnitarios;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import modelo.Pais;

class TestPais {

	@Test
	void agregarUnPaisALaListaDeOtro(){
		Pais argentina= new Pais("argentina");
		Pais uruguay= new Pais("uruguay");
		argentina.setConexion(uruguay);
		Assert.assertTrue(argentina.getConexiones().contains(uruguay));
	}
	//@Test
	/*void darCaracteristica() {
		Pais argentina= new Pais("argentina");
		argentina.setCaracteristicas("bandera celeste y blanca");
		
	}
*/
}
