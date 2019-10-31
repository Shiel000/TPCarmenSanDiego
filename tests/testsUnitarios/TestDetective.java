package testsUnitarios;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import lugaresDeInteres.LugarDeInteres;
import modelo.Detective;
import modelo.Caso;
import modelo.Villano;


class TestDetective {
	
	@Test
	
	void VillanoYDetectiveEstanEnElMismoLugarDeInteres() {
		LugarDeInteres lugar = Mockito.mock(LugarDeInteres.class);
		Caso caso = new Caso();
		Detective detective = new Detective(caso);
		detective.viajarAlLugarDeInteres(lugar);
		Villano villano = Mockito.mock(Villano.class);
		villano.setLugarActualDeInteresDelVillano(lugar);
		assertTrue(detective.estoyEnElMismoLugarQueElVillano(villano));			
	}
	
	@Test
	
	void VillanoYDetectiveNOEstanEnElMismoLugarDeInteres() {
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
	
	void esDondeEstoyParadoRecibeElLugarCorrecto() {
		LugarDeInteres lugar = Mockito.mock(LugarDeInteres.class);
		Caso caso = new Caso();
		Detective detective = new Detective(caso);
		detective.viajarAlLugarDeInteres(lugar);
		assertTrue(detective.esDondeEstoyParado(lugar));
	}
	
	@Test
	
	void esDondeEstoyParadoRecibeUnLugarIncorrecto() {
		LugarDeInteres lugar1 = Mockito.mock(LugarDeInteres.class);
		LugarDeInteres lugar2 = Mockito.mock(LugarDeInteres.class);
		Caso caso = new Caso();
		Detective detective = new Detective(caso);
		detective.viajarAlLugarDeInteres(lugar1);
		assertFalse(detective.esDondeEstoyParado(lugar2));
	}

}	