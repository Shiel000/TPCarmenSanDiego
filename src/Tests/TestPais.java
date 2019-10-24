package Tests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Tp.Pais;

class TestPais {

	@Test
	void agregarUnPaisALaListaDeOtro(){
		Pais argentina= new Pais();
		Pais uruguay= new Pais();
		argentina.setConexion(uruguay);
		Assert.assertTrue(argentina.getConexiones().contains(uruguay));
		
		
		

	}

}
