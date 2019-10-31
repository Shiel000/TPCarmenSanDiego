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

}
