package dataDammy;
import Lugares.Banco;
import modelo.*;


public class caSoDummy {
	
	public Caso crearCasoDuumy() { 
		Banco bancoNacionalDeViena =new Banco();
		Pais austria = new Pais("Austria");
		Pais australia = new Pais("Australia");
		Pais espania = new Pais("España");
		Pais colombia =new Pais("Colombia");
		Pais dinamarca= new Pais("Dinamarca");
		Pais argentina = new Pais("Argentina");
		Pais mexico = new Pais("Mexico");
		bancoNacionalDeViena.setPaisDeOrigenDelLugar(austria);
		String informe ="aca va el informe";
		String objeto ="aca va el objeto";
		Villano villano= new Villano("Carmen San Diego", "mujer", bancoNacionalDeViena);
		Caso nuevoCaso = new Caso(villano, australia, objeto, informe);
		return nuevoCaso;
	}

}
