package testsUnitarios;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import lugaresDeInteres.Biblioteca;
import lugaresDeInteres.LugarDeInteres;
import modelo.Pais;
import modelo.Villano;


class TestBiblioteca {

	@Test
void obtenerVillano_CuandoEsteEstaEnBiblioteca() {
		Biblioteca biblioteca = new Biblioteca();
		Villano villano = Mockito.mock(Villano.class);
		biblioteca.setVillanoEnElLugar(villano);
		assertEquals(villano,biblioteca.getVillanoEnElLugar());
	}

	@Test
	void obtengoPaisDeOrigenDeLaBiblioteca() {
		Biblioteca biblioteca = new Biblioteca();
		Pais francia = Mockito.mock(Pais.class);
		Pais brasil= Mockito.mock(Pais.class);
		biblioteca.setPaisDeOrigen(brasil);
		assertNotEquals(francia,biblioteca.getPaisDeOrigen());
	}
		
}
