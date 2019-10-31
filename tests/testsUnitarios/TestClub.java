package testsUnitarios;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import lugaresDeInteres.Club;
import modelo.Pais;
import modelo.Villano;

class TestClub {

	@Test
	public void obtenerVillanoCuandoEstaEnClub() {
		Club club = new Club();
		Villano villano = Mockito.mock(Villano.class);
		club.setVillanoEnElLugar(villano);
		assertEquals(villano,club.getVillanoEnElLugar());
	}
	
	@Test
	public void obtengoPaisDeOrigenDelClub() {
		Club club = new Club();
		Pais australia = Mockito.mock(Pais.class);
		club.setPaisDeOrigen(australia);
		assertEquals(australia,club.getPaisDeOrigen());
	}
	
	@Test
	public void obtenerVillanoCuandoNOEstaEnClubDevuelveNULL() {
		Club club = new Club();
		club.setVillanoEnElLugar(null);
		assertNull(club.getVillanoEnElLugar());
}
