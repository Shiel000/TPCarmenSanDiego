package testsUnitarios;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import lugaresDeInteres.Embajada;
import modelo.Pais;
import modelo.Villano;


class TestEmbajada {

	@Test
	void obtengoPaisDeOrigenDeLaEmbajada() {
		Embajada embajada = new Embajada();
		Pais brasil=Mockito.mock(Pais.class);
		embajada.setPaisDeOrigen(brasil);
		assertEquals(brasil,embajada.getPaisDeOrigen());
	}
	
	/*
	 * @Test
	void obtenerCaracteristicasDelPais_CuandoPasoElVillanoPorAhi(){
		Pais argentina=new Pais("argentina");
		argentina.setCaracteristicas("celeste y blanca");
		argentina.setCaracteristicas("tiene un solcito");
		Embajada embajada=new Embajada();
		Villano carmen= Mockito.mock(Villano.class);
		carmen.setLugarActualDeInteresDelVillano(embajada);
		when(carmen.)
		
		
		
	}
 */
}
