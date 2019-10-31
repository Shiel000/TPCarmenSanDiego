package modelo;

import excepciones.YaSeEncuentraEnElLugarException;
import excepciones.NoPuedoViajarAEsePaisException;
import excepciones.PerdioElJuegoException;
import lugaresDeInteres.LugarDeInteres;

@SuppressWarnings("unused")

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
		if(!tengoOrdenDeArresto) {
			this.villanoArrestar=villano;		
			this.tengoOrdenDeArresto=true;
		}
	}
	
	public void atraparVillano() {
		if(estoyEnElMismoLugarQueElVillano(villanoArrestar)&&tieneOrdenDeArrestoCorrecta(villanoArrestar)) {
			villanoArrestar.setEstaCapturado(true);
		}
		throw new PerdioElJuegoException();
	}

	public void viajarAlSiguientePais(Pais paisNuevo) {
		if(puedoViajarAlProximoPais(paisNuevo)) {
			paisAnterior=paisActual;
			paisActual=paisNuevo;
		}
		throw new NoPuedoViajarAEsePaisException();
	}

	public void viajarAlLugarDeInteres(LugarDeInteres lugar) {
		if(!esDondeEstoyParado(lugar)) {
			lugarActual=lugar;
			lugarActual.darPistas();
		}
		throw new YaSeEncuentraEnElLugarException();
	}
	public boolean esDondeEstoyParado(LugarDeInteres lugar) {
		return lugar.equals(lugar);
	}

	public boolean estoyEnElMismoLugarQueElVillano(Villano miVillano) {
		return paisActual.equals(miVillano.getPaisActual() )&& lugarActual.equals(miVillano.getLugarDeInteresActualVillano());
	}
	
	public boolean tieneOrdenDeArrestoCorrecta(Villano villano){ return villanoArrestar.equals(villano); }

	private boolean puedoViajarAlProximoPais(Pais paisNuevo) { return paisActual.tieneConexionAereaCon(paisNuevo); }
}

