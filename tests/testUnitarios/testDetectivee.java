package testUnitarios;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import Lugares.Banco;
import Lugares.Biblioteca;
import Lugares.Club;
import Lugares.Embajada;
import Lugares.LugarDeInteres;
import excepciones.NoPuedoViajarAEsePaisException;
import excepciones.YaSeEncuentraEnElLugarException;
import modelo.Caso;
import modelo.Detective;
import modelo.Pais;
import modelo.Villano;

public class testDetectivee {

	@Test
	public void viajarAlProximoDestino_CuandoNOEstoyEnEsePaisYPuedoViajar() {
		LugarDeInteres lugar = Mockito.mock(LugarDeInteres.class);
		Villano villanina = new Villano("villanina", "femenino", lugar);
		Pais pais= new Pais("pais");
		Caso caso=new Caso(villanina, pais,"pelusa, el gato dorado", "se informa que el robo de pelusa el raro gato dorado");
		Detective detective=new Detective(caso);
		Pais paisote= new Pais("paisote");
		pais.agregarConexionAerea(paisote);
		caso.setPaisDondeOcurrioElCrimen(pais);
		detective.viajarAlProximoDestino(paisote);
		Pais paisAlQueViajo = detective.getPaisActual();
		assertEquals(paisote, paisAlQueViajo);
	}
	
	@Test 
	public void ultimoLugarDeInteresDondeSeEncuentraElVillanoVillano_CuandoEsElUltmioLugar(){
		Biblioteca bibliotecaArgentina=new Biblioteca();
		Pais honduras= new Pais("honduras");
		Villano villanina = new Villano("villanina", "femenino", bibliotecaArgentina);
		Caso caso=new Caso(villanina, honduras, "moneda de 3 pesos", "oh no se robaron mi moneda ");
		Detective detective=new Detective(caso);
		LugarDeInteres ultimoLugarVillano=detective.ultimoLugarDeInteresDondeEstaElVillano();
		assertEquals(bibliotecaArgentina, ultimoLugarVillano);
		
	}
	@Test
	public void ultimoLugarDeInteresDondeSeEncuentraElVillanoVillano_CuandoNOEsElUltmioLugar(){
		Biblioteca bibliotecaArgentina=new Biblioteca();
		Club clubSacachispa=new Club();
		Pais honduras= new Pais("honduras");
		Villano villanina = new Villano("villanina", "femenino", clubSacachispa);
		Caso caso=new Caso(villanina, honduras, "moneda de 3 pesos", "oh no se robaron mi moneda ");
		Detective detective=new Detective(caso);
		LugarDeInteres ultimoLugarVillano=detective.ultimoLugarDeInteresDondeEstaElVillano();
		assertNotEquals(bibliotecaArgentina, ultimoLugarVillano);	
	}
	@Test
	public void viajarAlProximoLugarDeInteres_CuandoPuedoYNOEstoyEnEseLugar(){
		Biblioteca bibliotecaArgentina=new Biblioteca();
		Club clubSacachispa=new Club();
		Pais honduras= new Pais("honduras");
		Villano villane = new Villano("villane", " genero no binario", clubSacachispa);
		Caso caso=new Caso(villane, honduras, "antigua tablilla egipcia", "devuelbaaan la tablillaaaaa ");
		Detective detectivin=new Detective(caso);
		detectivin.setLugarDeInteresActual(bibliotecaArgentina);
		detectivin.viajarAlProximoLugarDeInteres(clubSacachispa);		
	}
	
	@Test
	public void pedirOrdeDeArresto() {
		Banco bancoHojitaRoja = new Banco();
		Pais mongolia= new Pais("mongolia");
		Villano villane = new Villano("villane", " genero no binario", bancoHojitaRoja);
		Caso caso=new Caso(villane,mongolia, "antigua tablilla egipcia", "devuelbaaan la tablillaaaaa ");
		Detective detectivin=new Detective(caso);
		detectivin.pedirOrdenDeArresto(villane);
	}
	@Test
	public void tengoLaordenDeArrestoCorrecta_CuandoLaTengo() {
		Banco bancoHojitaRoja = new Banco();
		Pais mongolia= new Pais("mongolia");
		Villano villana = new Villano("villana", " mujer trans", bancoHojitaRoja);
		Caso caso=new Caso(villana,mongolia, "michi naranjoso", "aww un michi");
		Detective detectivin=new Detective(caso);
		detectivin.pedirOrdenDeArresto(villana);
		detectivin.tieneLaOrdenDeArrestoCorrecta();
	}
	@Test
	public void tengoLaordenDeArrestoCorrecta_CuandoNOLaTengo() {
		Banco bancoHojitaRoja = new Banco();
		Banco bancoAguiluchoDelSur= new Banco();
		Pais mongolia= new Pais("mongolia");
		Villano villana = new Villano("villana", " mujer trans", bancoHojitaRoja);
		Villano villano = new Villano("villano", " hombre trans", bancoAguiluchoDelSur);
		Caso caso=new Caso(villano,mongolia, "michi naranjoso", "aww un michi");
		Detective detectivin=new Detective(caso);
		detectivin.pedirOrdenDeArresto(villana);
		boolean tieneLaCorrecta=detectivin.tieneLaOrdenDeArrestoCorrecta();
		assertFalse(tieneLaCorrecta);
	}
	@Test
	public void EsElUltimoPais_CuandoEsElUltimoPais() {
		Embajada embajadaDePolonia=new Embajada();
		Pais polonia =new Pais("polonia");
		Pais espania =new Pais("españa");
		embajadaDePolonia.setPaisDeOrigenDelLugar(polonia);
		Villano villano = new Villano("villano", " hombre trans", embajadaDePolonia);
		Caso caso=new Caso(villano,espania, "anillo antiguo", "uhhhh brilla");
		Detective detective = new Detective(caso);
		Pais ultimo =detective.ultimoPaisDondeEsaElVillano();
		assertEquals(polonia, ultimo);
		
	}
	@Test
	public void estaEnElMismoLugarDelVillano_CuandoLoEsta(){
		Embajada embajadaDePolonia=new Embajada();
		Pais polonia =new Pais("polonia");
		Pais espania =new Pais("españa");
		embajadaDePolonia.setPaisDeOrigenDelLugar(polonia);
		Villano villano = new Villano("villano", " hombre trans", embajadaDePolonia);
		Caso caso=new Caso(villano,espania, "anillo antiguo", "uhhhh brilla");
		Detective detective = new Detective(caso);
		detective.setLugarDeInteresActual(embajadaDePolonia);
		detective.estaEnElMismoLugarQueElSospechoso();
	}
	

	@Test(expected = YaSeEncuentraEnElLugarException.class)
	public void viajarAlProximoLugarDeInteres_CuandonNOPuedoYEstoyEnEseLugar(){
		Biblioteca bibliotecaArgentina=new Biblioteca();
		Club clubSacachispa=new Club();
		Pais honduras= new Pais("honduras");
		Villano villane = new Villano("villane", " genero no binario", clubSacachispa);
		Caso caso=new Caso(villane, honduras, "antigua tablilla egipcia", "devuelbaaan la tablillaaaaa ");
		Detective detectivin=new Detective(caso);
		detectivin.setLugarDeInteresActual(bibliotecaArgentina);
		detectivin.viajarAlProximoLugarDeInteres(bibliotecaArgentina);		
	}

	@Test(expected = NoPuedoViajarAEsePaisException.class)
	public void viajarAlProximoDestino_CuandoEstoyEnEsePaisYPuedoViajar() {
		LugarDeInteres lugar = Mockito.mock(LugarDeInteres.class);
		Villano villanina = new Villano("villanina", "femenino", lugar);
		Pais pais= new Pais("pais");
		Caso caso=new Caso(villanina, pais,"pelusa, el gato dorado", "se informa que el robo de pelusa el raro gato dorado");
		Detective detective=new Detective(caso);
		Pais paisote= new Pais("paisote");
		pais.agregarConexionAerea(paisote);
		caso.setPaisDondeOcurrioElCrimen(pais);
		detective.viajarAlProximoDestino(pais);		
	}
	
	
}
