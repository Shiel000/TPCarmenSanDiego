package testsUnitarios;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import modelo.Pista;


class TestPista {

	@Test
	void obtenerPistasADarTraeLasPistasCorrectas() {
		List<String> lista = new ArrayList<String>();
		lista.add("Es pelado");
		lista.add("Mide 1,80");
		Pista pista = new Pista();
		pista.setPistasAdar(lista);
		List<String> listaResultante = pista.getPistasAdar();
		assertTrue((listaResultante.get(0).equals("Es pelado")) && (listaResultante.get(1).equals("Mide 1,80")));
		
	}
	
	@Test
	void seAgregaUnaPistaCorrectamenteEnLasPistasADar() {
		List<String> lista = new ArrayList<String>();
		lista.add("Es pelado");
		Pista pista = new Pista();
		pista.setPistasAdar(lista);
		pista.agregarPista("Es rubio");
		List<String> listaResultante = pista.getPistasAdar();
		assertTrue(listaResultante.get(1).equals("Es rubio"));
		
	}
}
