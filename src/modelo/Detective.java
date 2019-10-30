package modelo;

import java.util.List;

public class Detective {
	private Caso caso;
	private Pais paisActual;
	private Pais paisAnterior;
	private LugarDeInteres lugarActual;
	private Villano villanoAArrestar;
	private boolean tengoOrdenDeArresto;
	private List<String> pistas;
	
	public Detective(Caso casoActual){
		this.caso = casoActual;
		this.paisActual=caso.getPaisDondeOcurrio();
		this.paisAnterior=null;
		this.tengoOrdenDeArresto=false;
		this.pistas = null;
	}
	
	public void pedirOrdenDeArresto(Villano villano) {
		if(!tengoOrdenDeArresto)
			this.villanoAArrestar=villano;		
			this.tengoOrdenDeArresto=true;
	}
	
	public void viajarA(Pais paisNuevo) {
		paisAnterior=paisActual;
		paisActual=paisNuevo;
	}
	public void viajarA(LugarDeInteres lugar) {
		lugarActual=lugar;
	}

	private void buscarPistasDelLugar() throws NoHayPistasException {
		this.pistas.addAll(lugarActual.darPistas(caso));
	}

	private Boolean esUltimoPaisEnRutaEscape(Pais pais) {
		Pais ultimo=caso.planDeEscapeDelVillano.get(caso.planDeEscapeDelVillano.size()-1);
		return pais==ultimo;
	}
	
}