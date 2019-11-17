package modelo;

public class Caso {
	private Villano villanoPosta;
	private Pais paisDondeOcurrioElCrimen;
	private String objetoRobado;
	private String informe;
	private boolean estaCerrado;

	public Caso(Villano villano,Pais pais,String objeto,String informe ){
		villanoPosta=villano;
		paisDondeOcurrioElCrimen=pais;
		objetoRobado=objeto;
		this.informe=informe;
		this.estaCerrado=false;
		
	}

	public String getSeniasParticularesDelVillano() {
		return villanoPosta.obtenerSeniaParticular();
	}

	
	public String getCaracteristicasDelProximoPaisDelVillano(Pais pais) {
		return villanoPosta.obtenerCaracteristicaDelProximoPais(pais);
	}

	public String getHobbiesDelVillano() {
		return villanoPosta.obtenerHobbies();
	}
	
	public Villano getVillanoPosta() {
		return villanoPosta;
	}

	public Pais getPaisDelRobo() {
	
		return paisDondeOcurrioElCrimen;
	}

	public void setVillano(Villano villano) {
		this.villanoPosta=villano;
		
	}

	public Pais getPaisDondeOcurrioElCrimen() {
		return paisDondeOcurrioElCrimen;
	}

	public void setPaisDondeOcurrioElCrimen(Pais paisDondeOcurrioElCrimen) {
		this.paisDondeOcurrioElCrimen = paisDondeOcurrioElCrimen;
	}

	public void setEstaCerrado(boolean condicion) {
		estaCerrado=condicion;
		
	}

}
