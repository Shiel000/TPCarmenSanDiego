package testDeIntegracion;
import org.junit.Test;

import Lugares.Banco;
import Lugares.Biblioteca;
import Lugares.Embajada;
import excepciones.NoTieneLaOrdenDeArrestoCorrecta;
import modelo.Caso;
import modelo.Detective;
import modelo.Pais;
import modelo.Villano;

public class testPerdioElJuego {
	
	@Test (expected = NoTieneLaOrdenDeArrestoCorrecta.class)
	public void pierdeElJuegoElDetective_cuandoTieneLaOrdenDeArrectoIncorrecta() {
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
		Villano igor =new Villano("igor dmtricj", "masculino", embajadaDeJapon);
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
		miDetective.viajarAlProximoLugarDeInteres(bibliotecaHojitaRoja);
		miDetective.pedirPista(bibliotecaHojitaRoja);
		miDetective.viajarAlProximoDestino(alemania);
		miDetective.viajarAlProximoLugarDeInteres(bancoAleman);
		miDetective.pedirPista(bancoAleman);
		miDetective.pedirOrdenDeArresto(igor);
		miDetective.viajarAlProximoDestino(japon);
		miDetective.viajarAlProximoLugarDeInteres(embajadaDeJapon);
		miDetective.resolverCaso();
	}


}
