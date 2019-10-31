package modelo;
import java.util.List;

public class Caso {
	private Villano sospechoso;
	public List<Pais>planDeEscapeDelSospechoso;
	private String reporte;
	private String objetoRobado;
	private Pais paisDondeOcurrioElCrimen;
	
	public Villano getSospechoso() {
		return sospechoso;
	}
	public void setSospechoso(Villano sospechoso) {
		this.sospechoso = sospechoso;
	}
	public List<Pais> getPlanDeEscapeDelSospechoso() {
		return planDeEscapeDelSospechoso;
	}
	public void setPlanDeEscapeDelSospechoso(List<Pais> planDeEscapeDelSospechoso) {
		this.planDeEscapeDelSospechoso = planDeEscapeDelSospechoso;
	}
	public String getReporte() {
		return reporte;
	}
	public void setReporte(String reporte) {
		this.reporte = reporte;
	}
	public String getObjetoRobado() {
		return objetoRobado;
	}
	public void setObjetoRobado(String objetoRobado) {
		this.objetoRobado = objetoRobado;
	}
	public Pais getPaisDondeOcurrioElCrimen() {
		return paisDondeOcurrioElCrimen;
	}
	public void setPaisDondeOcurrioElCrimen(Pais paisDondeOcurrioElCrimen) {
		this.paisDondeOcurrioElCrimen = paisDondeOcurrioElCrimen;
	}

	
	
}
