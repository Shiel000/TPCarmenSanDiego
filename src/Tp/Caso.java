package Tp;
import java.util.List;

public class Caso {
	private Villano responsable;
	public List<Pais>planDeEscape;
	private String reporte;
	private String objetoRobado;
	private Pais paisDondeOcurrioElSiniestro;
	
	
	
	
	
	
	
	
	
	private Boolean estaResueltoElCaso() {
		if(responsable.estaCapturado()) {
			return true;
		}
		return false;
	}
	
	/*public Boolean seEncuentraPaisEnElPanDeEscape(Pais paisCualquiera) {
		return planDeEscape.contains(paisCualquiera);
		
	}*/
}
