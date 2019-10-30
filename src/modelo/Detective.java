package modelo;

import java.util.ArrayList;
import java.util.List;

public class Detective {
	private Caso caso;
	private Pais paisActual;
	private Pais paisAnterior;
	private LugarDeInteres lugarAVisitar;
	private Villano villanoAArrestar;
	private boolean tengoOrdenDeArresto;
	
	public Detective(Caso casoActual){
		this.caso = casoActual;
		this.paisActual=caso.getPaisDondeOcurrio();
		this.paisAnterior=null;
		this.tengoOrdenDeArresto=false;
	}
	
	public void pedirOrdenDeArresto(Villano villano) {
		if(!tengoOrdenDeArresto)
			this.villanoAArrestar=villano;		
			this.tengoOrdenDeArresto=true;
	}
	
	public void viajar(Pais paisNuevo) {
		paisAnterior=paisActual;
		paisActual=paisNuevo;
	}
	public void visitarLugar(LugarDeInteres lugar) {
		lugarAVisitar=lugar;
		obtenerPistaDelLugar();
	}

	private List<String> obtenerPistaDelLugar() {
		return lugarAVisitar.darPista(caso);
		
	}
	
	
	
}