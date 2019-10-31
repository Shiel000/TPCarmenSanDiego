package testsUnitarios;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
		assertTrue(detective.estoyEnElMismoLugarQueElVillano(villano));			
	}
	
	@Test
	
	public void VillanoYDetectiveNOEstanEnElMismoLugarDeInteres() {
		LugarDeInteres lugar1 = Mockito.mock(LugarDeInteres.class);
		LugarDeInteres lugar2 = Mockito.mock(LugarDeInteres.class);
		Caso caso = new Caso();
		Detective detective = new Detective(caso);
		detective.viajarAlLugarDeInteres(lugar1);
		Villano villano = Mockito.mock(Villano.class);
		villano.setLugarActualDeInteresDelVillano(lugar2);	
		assertFalse(detective.estoyEnElMismoLugarQueElVillano(villano));
	}
	
	@Test
	
	public void esDondeEstoyParadoRecibeElLugarCorrecto() {
		LugarDeInteres lugar = Mockito.mock(LugarDeInteres.class);
		Caso caso = new Caso();
		Detective detective = new Detective(caso);
		detective.viajarAlLugarDeInteres(lugar);
		assertTrue(detective.esDondeEstoyParado(lugar));
	}
	
	@Test
	
	public void esDondeEstoyParadoRecibeUnLugarIncorrecto() {
		LugarDeInteres lugar1 = Mockito.mock(LugarDeInteres.class);
		LugarDeInteres lugar2 = Mockito.mock(LugarDeInteres.class);
		Caso caso = new Caso();
		Detective detective = new Detective(caso);
		detective.viajarAlLugarDeInteres(lugar1);
		assertFalse(detective.esDondeEstoyParado(lugar2));
	}

}	