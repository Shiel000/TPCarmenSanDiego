package testsUnitarios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import lugaresDeInteres.Embajada;
import modelo.Pais;
import modelo.Pista;
import modelo.Villano;


class TestEmbajada {

	@Test
	void obtengoPaisDeOrigenDeLaEmbajada() {
		Embajada embajada = new Embajada();
		Pais brasil=Mockito.mock(Pais.class);
		embajada.setPaisDeOrigen(brasil);
		assertEquals(brasil,embajada.getPaisDeOrigen());
		
	}
	@Test 
	void obtengoPista_CuandoElVillanoEstaEnLaEmbajada() {
		Embajada embajada=new Embajada();
		Pais brasil=Mockito.mock(Pais.class);
		embajada.setPaisDeOrigen(brasil);
		Villano villano=Mockito.mock(Villano.class);
		villano.setLugarActualDeInteresDelVillano(embajada);
		assertNotNull(embajada.darPistas());
	}
	
	@Test
	void cambiarVillanoPorOtroEnBibliotecaYLoObtengo() {
		Embajada embajada = new Embajada();
		Villano villano1 = Mockito.mock(Villano.class);
		embajada.setVillanoEnElLugar(villano1);
		Villano villano2 = Mockito.mock(Villano.class);
		embajada.setVillanoEnElLugar(villano2);
		assertEquals(villano2,embajada.getVillanoEnElLugar);
	}
	
	void AlCambiarElPaisDeOrigenPorOtroEnEmbajadaObtengoElNuevo() {
		Embajada embajada = new Embajada();
		Pais pais = Mockito.mock(Pais.class);
		embajada.setPaisDeOrigen(pais);
		Pais pais2 = Mockito.mock(Pais.class);
		embajada.setPaisDeOrigen(pais2);
		assertEquals(pais2,embajada.getPaisDeOrigen);

}
