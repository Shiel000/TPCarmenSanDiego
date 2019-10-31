package testsUnitarios;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import lugaresDeInteres.Biblioteca;
import modelo.Pais;
import modelo.Villano;


class TestBiblioteca {

	@Test
	void obtenerVillanoCuandoEstaEnBiblioteca() {
		Biblioteca biblioteca = new Biblioteca;
		Villano villano = Mockito.mock(Villano.class);
		biblioteca.setVillanoEnElLugar(villano);
		assertEquals(villano,biblioteca.getVillanoEnElLugar());
	}
	
	@Test
	void obtengoPaisDeOrigenDeLaBiblioteca() {
		Biblioteca biblioteca = new Biblioteca;
		Pais francia = Mockito.mock(Pais.class);
		biblioteca.setPaisDeOrigen(brasil);
		assertEquals(francia,biblioteca.getPaisDeOrigen());
	}
		
		
	}

}
