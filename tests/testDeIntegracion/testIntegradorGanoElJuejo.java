package testDeIntegracion;

import org.junit.Test;

import Lugares.Banco;
import Lugares.Biblioteca;
import Lugares.Embajada;
import modelo.Caso;
import modelo.Detective;
import modelo.Juego;
import modelo.Pais;
import modelo.Villano;

public class testIntegradorGanoElJuejo {

	@Test
	public void GanaElJuegoElDetective() {
		Embajada embajadaDeJapon =new Embajada();
		Banco bancoAleman=new Banco();
		Biblioteca bibliotecaHojitaRoja = new Biblioteca();
		Pais japon=new Pais("japon");
		Pais alemania=new Pais("alemania");
		Pais canada=new Pais("canada");
		canada.agregarConexionAerea(alemania);
		alemania.agregarConexionAerea(japon);
		embajadaDeJapon.setPaisDeOrigenDelLugar(japon);	
		bancoAleman.setPaisDeOrigenDelLugar(alemania);
		bibliotecaHojitaRoja.setPaisDeOrigenDelLugar(canada);
		bibliotecaHojitaRoja.setVillanoEstuvoAqui(true);
		bancoAleman.setVillanoEstuvoAqui(true);
		embajadaDeJapon.setVillanoEstuvoAqui(true);
		Villano carmen= new Villano("Carmen Sandiego", "mujer", embajadaDeJapon);
		carmen.agregarSeniasParticulares("cabello largo y sedoso");
		carmen.agregarSeniasParticulares("ojos grandes y marrones");
		carmen.agregarSeniasParticulares("labios rojos");
		carmen.agregarHobbies("escalar montanias");
		carmen.agregarHobbies("comida asiatica");
		carmen.agregarHobbies("le gusta el manga");
		carmen.agregarPaisAlaRutaDeEscape(canada);
		carmen.agregarPaisAlaRutaDeEscape(alemania);
		carmen.agregarPaisAlaRutaDeEscape(japon);
		alemania.setCaracteristicas("hay cerveza");
		alemania.setCaracteristicas("rammstein");
		japon.setCaracteristicas("ITADAKIMASUYOOOOOOOOOO");
		japon.setCaracteristicas("el pais del sol naciente");
		Caso caso= new Caso(carmen, canada, "Anillo antiguo", "tesoro nacional de canada");
		Detective miDetective =new Detective(caso);
		Juego juego=new Juego(caso,miDetective);
		miDetective.viajarAlProximoLugarDeInteres(bibliotecaHojitaRoja);
		miDetective.viajarAlProximoDestino(alemania);
		miDetective.viajarAlProximoLugarDeInteres(bancoAleman);
		miDetective.pedirOrdenDeArresto(carmen);
		miDetective.viajarAlProximoDestino(japon);
		miDetective.viajarAlProximoLugarDeInteres(embajadaDeJapon);
		juego.resolvioElCaso();
	}

}
