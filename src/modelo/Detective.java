package modelo;

import java.util.List;

import excepciones.NoPuedoViajarAEsePaisException;
import lugaresDeInteres.LugarDeInteres;

public class Detective {
	private Caso caso;
	private Pais paisActual;
	private Pais paisAnterior;
	private LugarDeInteres lugarActual;
	private Villano villanoArrestar;
	private boolean tengoOrdenDeArresto;
	
	public Detective(Caso casoActual){
		this.caso = casoActual;
		this.paisActual=caso.getPaisDondeOcurrioElCrimen();
		this.paisAnterior=null;
		this.tengoOrdenDeArresto=false;
	}
	
	
	public void pedirOrdenDeArresto(Villano villano) {
		if(!tengoOrdenDeArresto)
			this.villanoArrestar=villano;		
			this.tengoOrdenDeArresto=true;
	}
	
	public void viajarAlSiguientePais(Pais paisNuevo) {
		if(puedoViajarAlProximoPais(paisNuevo)) {
			paisAnterior=paisActual;
			paisActual=paisNuevo;
		}
		throw new NoPuedoViajarAEsePaisException();

	}
	private boolean puedoViajarAlProximoPais(Pais paisNuevo) {
		return paisActual.tieneConexionAereaCon(paisNuevo);
	}


	public void viajarAlLugarDeInteres(LugarDeInteres lugar) {
		if(!esDondeEstoyParado(lugar)) {
			lugarActual=lugar;
			obtenerPistaDelLugar();
		}
	}

	private boolean esDondeEstoyParado(LugarDeInteres lugar) {
		return lugar==lugarActual;
	}

	private List<String> obtenerPistaDelLugar() {
		return lugarActual.darPistas(caso);
		
	}


	public boolean tieneOrdenDeArrestoCorrecta(Villano villano){
		return villanoArrestar == villano; 
	}
	
	public boolean estoyEnElMismoLugarQueElVillano(Villano miVillano) {
		return paisActual== miVillano.getPaisActual() && lugarActual==miVillano.getLugarDeInteresActualVillano();
	}


}