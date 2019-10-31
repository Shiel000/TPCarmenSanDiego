package testsUnitarios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import lugaresDeInteres.Banco;
import modelo.Pais;
import modelo.Villano;



class TestBanco {
	
	@Test
	void obtenerVillanoCuandoEstaEnBanco() {
		Banco banco = new Banco();
		Villano villano = Mockito.mock(Villano.class);
		banco.setVillanoEnElLugar(villano);
		assertEquals(villano,banco.getVillanoEnElLugar());
	}
	
	@Test
	void obtengoPaisDeOrigenDelBanco() {
		Banco banco = new Banco();
		Pais australia = Mockito.mock(Pais.class);
		banco.setPaisDeOrigen(australia);
		assertEquals(australia,banco.getPaisDeOrigen());
	}
	
	@Test
	void AlCambiarElPaisDeOrigenPorOtroEnBancoObtengoElNuevo() {
		Banco banco = new Club();
		Pais pais = Mockito.mock(Pais.class);
		banco.setPaisDeOrigen(pais);
		Pais pais2 = Mockito.mock(Pais.class);
		banco.setPaisDeOrigen(pais2);
		assertEquals(pais2,banco.getPaisDeOrigen());
	}

}
