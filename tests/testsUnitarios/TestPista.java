package testsUnitarios;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import modelo.Pista;


class TestPista {

	@Test
	void obtenerPistasADarTraeLasPistasCorrectas() {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Es pelado");
		lista.add("Mide 1,80");
		Pista pista = new Pista();
		pista.setPistaAdar(lista);
		ArrayList<String> listaResultante = pista.getPistasAdar();
		assertTrue((listaResultante.get(0).equals("Es pelado")) && (listaResultante.get(1).equals("Mide 1,80")));
		
	}
	
	@Test
	void seAgregaUnaPistaCorrectamenteEnLasPistasADar() {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Es pelado");
		Pista pista = new Pista();
		pista.setPistaAdar(lista);
		pista.agregarPista("Es rubio");
		ArrayList<String> listaResultante = pista.getPistasAdar();
		assertTrue(listaResultante.get(1).equals("Es rubio"));
		
	}
}
