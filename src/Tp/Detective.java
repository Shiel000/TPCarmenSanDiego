package Tp;

import java.util.ArrayList;
import java.util.List;

public class Detective {
	private Caso caso;
	private ArrayList<Pais> paisesInvestigados;
	private Villano villanoAArrestar;
	private boolean tengoOrdenDeArresto;
	
	public Detective(Caso casoActual){
		this.caso = casoActual;
		this.paisesInvestigados=new ArrayList<Pais>();
		this.paisesInvestigados.add(caso.getPaisDondeOcurrio());
		this.tengoOrdenDeArresto=false;
	}
	
	public void pedirOrdenDeArresto(Villano villano) {
		if(!tengoOrdenDeArresto)
			this.villanoAArrestar=villano;		
			this.tengoOrdenDeArresto=true;
	}
	
	public void viajar(Pais pais) {
		
	}
}
