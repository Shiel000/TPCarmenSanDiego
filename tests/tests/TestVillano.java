package tests;
import org.junit.Assert;
import org.junit.Test;

import modelo.Villano;

class TestVillano {


	@Test
	void obtenerNombreDelVillanoTest() {
		Villano villano= new Villano();
		villano.setNombre("Carmen Sandiego");
		
		Assert.assertEquals("Carmen San Diego", villano.getNombre());
	}
	

}
