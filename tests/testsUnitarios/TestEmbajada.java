package testsUnitarios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.List;

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
		Pais brasil= new Pais("brasil");
		Pais japon=new Pais("japon");
		Pais inglaterra=new Pais("Inglaterra");
		japon.setCaracteristicas("pais del sol naciente");
		japon.setCaracteristicas("domo arigato mr.roboto");
		embajada.setPaisDeOrigen(brasil);
		Villano villano=new Villano("Dororo", "mujer");
		villano.agregarARutaDeEscape(brasil);
		villano.agregarARutaDeEscape(japon);
		villano.agregarARutaDeEscape(inglaterra);
		villano.setLugarActualDeInteresDelVillano(embajada);
		villano.getPlanDeEscape().contains(japon);
		
		
	}

}
