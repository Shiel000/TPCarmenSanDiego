package tests;
import org.junit.Assert;
import org.junit.Test;

import modelo.Villano;

class TestVillano {
	@Test
	void obtenerNombreDelVillanoCuandoNoEsNullTest() {
		
		Villano villano= new Villano("Carmen San Diego", null);
		String nombreEsperado= villano.getNombre();
		Assert.assertEquals(null, nombreEsperado);
	}
	

}
