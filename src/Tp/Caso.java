package Tp;
import java.util.List;

public class Caso {
	private Villano responsable;
	public List<Pais>planDeEscape;
	private String reporte;
	private String objetoRobado;
	private Pais paisDondeOcurrio;	
	
	public Villano getResponsable() {
		return responsable;
	}
	
	public void setResponsable(Villano responsable) {
		this.responsable = responsable;
	}

	public Pais getPaisDondeOcurrio() {
		return paisDondeOcurrio;
	}
	
	/*public Boolean seEncuentraPaisEnElPanDeEscape(Pais paisCualquiera) {
		return planDeEscape.contains(paisCualquiera);
		
	}*/
}
