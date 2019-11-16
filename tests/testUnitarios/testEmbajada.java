package testUnitarios;
import org.junit.Test;
import org.mockito.Mockito;
import Lugares.Embajada;
import modelo.Caso;
import modelo.Pais;
import modelo.Villano;

public class testEmbajada {

	@Test
	public void darPista_CuandoElVillanoPasoPorAhi() {
		Villano villanon = Mockito.mock(Villano.class);
		Embajada embajadaDeCoreaDelSur = new Embajada();
		Pais pais=Mockito.mock(Pais.class);
		Pais doblePais=Mockito.mock(Pais.class);
		pais.agregarConexionAerea(doblePais);
		doblePais.setCaracteristicas("es en asia");
		doblePais.setCaracteristicas("kimpchi");
		doblePais.setCaracteristicas("les gusta el K-pop");
		villanon.agregarPaisAlaRutaDeEscape(pais);
		villanon.agregarPaisAlaRutaDeEscape(doblePais);
		embajadaDeCoreaDelSur.setPaisDeOrigenDelLugar(pais);
		embajadaDeCoreaDelSur.setVillanoEstuvoAqui(true);
		Caso caso=Mockito.mock(Caso.class);
		embajadaDeCoreaDelSur.darPista(caso);	
	}
	
	@Test
	public void darPista_CuandoElVillanoNOPasoPorAhi() {
		Villano villanon = Mockito.mock(Villano.class);
		Embajada embajadaDeCoreaDelSur = new Embajada();
		Pais pais=Mockito.mock(Pais.class);
		Pais doblePais=Mockito.mock(Pais.class);
		pais.agregarConexionAerea(doblePais);
		doblePais.setCaracteristicas("es en asia");
		doblePais.setCaracteristicas("kimpchi");
		doblePais.setCaracteristicas("les gusta el K-pop");
		villanon.agregarPaisAlaRutaDeEscape(pais);
		villanon.agregarPaisAlaRutaDeEscape(doblePais);
		embajadaDeCoreaDelSur.setPaisDeOrigenDelLugar(pais);
		embajadaDeCoreaDelSur.setVillanoEstuvoAqui(false);
		Caso caso=Mockito.mock(Caso.class);
		try{
			embajadaDeCoreaDelSur.darPista(caso);
		}
		catch(Exception NoHayPistasException){
		}	
	}	
}
