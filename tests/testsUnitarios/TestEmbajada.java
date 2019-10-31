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
		embajada.darPistas();
		villano.getPlanDeEscape().contains(japon);
	}
	
	@Test
	void cambiarVillanoPorOtroEnEmbajadaYLoObtengo() {
		Embajada embajada = new Embajada();
		Villano villano1 = Mockito.mock(Villano.class);
		embajada.setVillanoEnElLugar(villano1);
		Villano villano2 = Mockito.mock(Villano.class);
		embajada.setVillanoEnElLugar(villano2);
		assertEquals(villano2,embajada.getVillanoEnElLugar());
	}
	 
	@Test
	void AlCambiarElPaisDeOrigenPorOtroEnEmbajadaObtengoElNuevo() {
		Embajada embajada = new Embajada();
		Pais pais = Mockito.mock(Pais.class);
		embajada.setPaisDeOrigen(pais);
		Pais pais2 = Mockito.mock(Pais.class);
		embajada.setPaisDeOrigen(pais2);
		assertEquals(pais2,embajada.getPaisDeOrigen());
	}	

}
