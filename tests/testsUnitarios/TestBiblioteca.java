package testsUnitarios;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;

import lugaresDeInteres.Biblioteca;
import modelo.Pais;
import modelo.Villano;


class TestBiblioteca {

	@Test
	void obtenerVillanoCuandoEstaEnBiblioteca() {
		Biblioteca biblioteca = new Biblioteca();
		Villano villano = Mockito.mock(Villano.class);
		biblioteca.setVillanoEnElLugar(villano);
		assertEquals(villano,biblioteca.getVillanoEnElLugar());
	}
	
	@Test
	void obtengoPaisDeOrigenDeLaBiblioteca() {
		Biblioteca biblioteca = new Biblioteca();
		Pais francia = Mockito.mock(Pais.class);
		biblioteca.setPaisDeOrigen(francia);
		assertEquals(francia,biblioteca.getPaisDeOrigen());
	}
		
	@Test
	void AlcambiarVillanoPorOtroEnBibliotecaObtengoElNuevo() {
		Biblioteca biblioteca = new Biblioteca();
		Villano villano1 = Mockito.mock(Villano.class);
		biblioteca.setVillanoEnElLugar(villano1);
		Villano villano2 = Mockito.mock(Villano.class);
		biblioteca.setVillanoEnElLugar(villano2);
		assertEquals(villano2,biblioteca.getVillanoEnElLugar());
	}
	
	@Test
	void AlCambiarElPaisDeOrigenPorOtroEnBibliotecaObtengoElNuevo() {
		Biblioteca biblioteca = new Biblioteca();
		Pais pais = Mockito.mock(Pais.class);
		biblioteca.setPaisDeOrigen(pais);
		Pais pais2 = Mockito.mock(Pais.class);
		biblioteca.setPaisDeOrigen(pais2);
		assertEquals(pais2,biblioteca.getPaisDeOrigen());
		
	}
}
