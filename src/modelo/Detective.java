package modelo;

import java.util.ArrayList;
import java.util.List;

import lugaresDeInteres.LugarDeInteres;

public class Detective {
	private Caso caso;
	private Pais paisActual;
	private Pais paisAnterior;
	private LugarDeInteres lugarActual;
	private Villano villanoAArrestar;
	private boolean tengoOrdenDeArresto;
	
	public Detective(Caso casoActual){
		this.caso = casoActual;
		this.paisActual=caso.getPaisDondeOcurrioElCrimen();
		this.paisAnterior=null;
		this.tengoOrdenDeArresto=false;
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
		obtenerPistaDelLugar();
	}

	private List<String> obtenerPistaDelLugar() {
		return lugarActual.darPistas(caso);
		
	}

	/*private Boolean esUltimoPaisEnRutaEscape(Pais pais) {
		Pais ultimo=caso.planDeEscapeDelVillano.get(caso.planDeEscapeDelVillano.size()-1);
		return pais==ultimo;
	}*/
	
}