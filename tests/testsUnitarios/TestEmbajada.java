package testsUnitarios;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
	/*@Test
	void obtenerCaracteristicasDelPais_CuandoPasoElVillanoPorAhi(){
		Pais argentina=new Pais("argentina");
		argentina.setCaracteristicas("celeste y blanca");
		argentina.setCaracteristicas("tiene un solcito");
		Pais china=new Pais("china");
		china.setCaracteristicas("esta en el otro lado del mundo");
		china.setCaracteristicas("bandera roja con estrellitas amarillas");
		Embajada embajada=new Embajada();
		embajada.setPaisDeOrigen(china);
		Villano carmen= Mockito.mock(Villano.class);
		carmen.setLugarActualDeInteresDelVillano(embajada);
		when(carmen.darCaracteristicasDelSiguientePaisEnLARutaDeEscape()).thenReTurn ();
		
		*/
		
	}

}
