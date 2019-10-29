package Tp;
import java.util.List;

public class Caso {
	private Villano responsable;
	public List<Pais>planDeEscape;
	private String reporte;
	private String objetoRobado;
	private Pais paisDondeOcurrioElSiniestro;
	
	
	
	
	
	
	
	
	
	private Boolean estaResueltoElCaso() {
		if(getResponsable().estaCapturado()) {
			return true;
		}
		return false;
	}









	public Villano getResponsable() {
		return responsable;
	}









	public void setResponsable(Villano responsable) {
		this.responsable = responsable;
	}
	
	/*public Boolean seEncuentraPaisEnElPanDeEscape(Pais paisCualquiera) {
		return planDeEscape.contains(paisCualquiera);
		
	}*/
}
