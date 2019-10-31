package modelo;
import java.util.List;

public class Caso {
	private Villano responsable;
	public List<Pais>planDeEscapeDelVillano;
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
}
