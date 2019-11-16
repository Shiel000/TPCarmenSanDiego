package testUnitarios;
import org.junit.Test;
import org.mockito.Mockito;
import Lugares.Club;
import modelo.Caso;
import modelo.Pais;
import modelo.Villano;

public class testClub {

	@Test
	public void darPista_CuandoElVillanoPasoPorAhi() {
		Villano villanon = Mockito.mock(Villano.class);
		Club bellavista = new Club();
		Pais pais=Mockito.mock(Pais.class);
		Pais nuevoPais=Mockito.mock(Pais.class);
		pais.agregarConexionAerea(nuevoPais);
		villanon.agregarPaisAlaRutaDeEscape(pais);
		villanon.agregarPaisAlaRutaDeEscape(nuevoPais);
		villanon.agregarSeniasParticulares("boca Grande");
		villanon.agregarSeniasParticulares("nariz respingada");
		villanon.agregarHobbies("le gusta el surf");
		villanon.agregarHobbies("paseo en la playa");
		bellavista.setPaisDeOrigenDelLugar(pais);
		bellavista.setVillanoEstuvoAqui(true);
		Caso caso=Mockito.mock(Caso.class);
		bellavista.darPista(caso);	
	}
	
	@Test
	public void darPista_CuandoElVillanoNOPasoPorAhi() {
		Villano villanon = Mockito.mock(Villano.class);
		Club bellavista = new Club();
		Pais pais=Mockito.mock(Pais.class);
		Pais nuevoPais=Mockito.mock(Pais.class);
		pais.agregarConexionAerea(nuevoPais);
		villanon.agregarPaisAlaRutaDeEscape(pais);
		villanon.agregarPaisAlaRutaDeEscape(nuevoPais);
		villanon.agregarSeniasParticulares("boca Grande");
		villanon.agregarSeniasParticulares("nariz respingada");
		villanon.agregarHobbies("le gusta el surf");
		villanon.agregarHobbies("paseo en la playa");
		bellavista.setPaisDeOrigenDelLugar(pais);
		bellavista.setVillanoEstuvoAqui(false);
		Caso caso=Mockito.mock(Caso.class);
		try{
			bellavista.darPista(caso);
		}
		catch(Exception NoHayPistasException){
		}	
	}	

}
