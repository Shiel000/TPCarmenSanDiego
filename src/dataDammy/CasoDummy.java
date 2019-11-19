package dataDammy;
import modelo.*;
import Lugares.*;
public class CasoDummy {
	
	private Caso caso;

	public CasoDummy() { 
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

	}
	
	public String getObjetoRobado() {
		return caso.getObjetoRobado();		
	}

}
