package testUnitarios;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import Lugares.Banco;
import modelo.Caso;
import modelo.Pais;
import modelo.Villano;

class testBanco {

	@Test
	public void darPista_CuandoElVillanoPasoPorAhi() {
		Villano villanon = Mockito.mock(Villano.class);
		Banco bancoNacion = new Banco();
		Pais pais=Mockito.mock(Pais.class);
		Pais doblePais=Mockito.mock(Pais.class);
		pais.agregarConexionAerea(doblePais);
		doblePais.setCaracteristicas("tiene montanias");
		doblePais.setCaracteristicas("su bandera tiene una luna");
		doblePais.setCaracteristicas("hay camellos raros");
		villanon.agregarPaisAlaRutaDeEscape(pais);
		villanon.agregarPaisAlaRutaDeEscape(doblePais);
		villanon.agregarSeniasParticulares("tiene el tatuaje de un banana en pijamas");
		villanon.agregarSeniasParticulares("ojos color chocolate");
		bancoNacion.setPaisDeOrigenDelLugar(pais);
		bancoNacion.setVillanoEstuvoAqui(true);
		Caso caso=Mockito.mock(Caso.class);
		bancoNacion.darPista(caso);	
	}
	
	@Test
	public void darPista_CuandoElVillanoNOPasoPorAhi() {
		Villano villanon = Mockito.mock(Villano.class);
		Banco bancoNacion = new Banco();
		Pais pais=Mockito.mock(Pais.class);
		Pais doblePais=Mockito.mock(Pais.class);
		pais.agregarConexionAerea(doblePais);
		doblePais.setCaracteristicas("tiene montanias");
		doblePais.setCaracteristicas("su bandera tiene una luna");
		doblePais.setCaracteristicas("hay camellos raros");
		villanon.agregarPaisAlaRutaDeEscape(pais);
		villanon.agregarPaisAlaRutaDeEscape(doblePais);
		villanon.agregarSeniasParticulares("tiene el tatuaje de un banana en pijamas");
		villanon.agregarSeniasParticulares("ojos color chocolate");
		bancoNacion.setPaisDeOrigenDelLugar(pais);
		bancoNacion.setVillanoEstuvoAqui(false);
		Caso caso=Mockito.mock(Caso.class);
		try{
			bancoNacion.darPista(caso);
		}
		catch(Exception NoHayPistasException){
		}	
	}	

}
