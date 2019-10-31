package testsUnitarios;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import modelo.Detective;
import modelo.Caso;
import modelo.Villano;
import lugaresDeInteres.LugarDeInteres;

class TestDetective {
	
	@Test
	
	public void VillanoYDetectiveEstanEnElMismoLugarDeInteres() {
		LugarDeInteres lugar = Mockito.mock(LugarDeInteres.class);
		Caso caso = new Caso();
		Detective detective = new Detective(caso);
		detective.viajarAlLugarDeInteres(lugar);
		Villano villano = Mockito.mock(Villano.class);
		villano.setLugarActualDeInteresDelVillano(lugar);
		assertTrue(estoyEnElMismoLugarQueElVillano(villano));			
	}
	
	@Test
	
	public void VillanoYDetectiveNOEstanEnElMismoLugarDeInteres() {
		LugarDeInteres lugar1 = Mockito.mock(LugarDeInteres.class);
		LugarDeInteres lugar2 = Mockito.mock(LugarDeInteres.class);
		Caso caso = New Caso();
		Detective detective = new Detective(caso);
		detective.viajarAlLugarDeInteres(lugar1);
		Villano villano = Mockito.mock(Villano.class);
		villano.setLugarActualDeInteresDelVillano(lugar2);	
		assertFalse(estoyEnElMismoLugarQueElVillano(villano));
	}
	
	@Test
	
	void esDondeEstoyParadoRecibeElLugarCorrecto() {
		LugarDeInteres lugar = Mockito.mock(LugarDeInteres.class);
		Caso caso = New Caso();
		Detective detective = new Detective(caso);
		detective.viajarAlLugarDeInteres(lugar);
		assertTrue(esDondeEstoyParado(lugar));
	}
	
	@Test
	
	void esDondeEstoyParadoRecibeUnLugarIncorrecto() {
		LugarDeInteres lugar1 = Mockito.mock(LugarDeInteres.class);
		LugarDeInteres lugar2 = Mockito.mock(LugarDeInteres.class);
		Caso caso = New Caso();
		Detective detective = new Detective(caso);
		detective.viajarAlLugarDeInteres(lugar1);
		assertFalse(esDondeEstoyParado(lugar2));
	}

}	