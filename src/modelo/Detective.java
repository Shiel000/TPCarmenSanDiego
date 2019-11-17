package modelo;


import Lugares.LugarDeInteres;
import excepciones.NoPuedoViajarAEsePaisException;
import excepciones.NoSeEncuentraEnEseLugarElVillano;
import excepciones.NoTieneLaOrdenDeArrestoCorrecta;
import excepciones.YaSeEncuentraEnElLugarException;

public class Detective {
	private Caso caso;
	protected Villano posibleSospechoso;
	private Pais paisActual;
	private Pais paisAnterior;
	private LugarDeInteres lugarActual;
	private boolean tengoOrdenDeArresto;

	public Detective(Caso caso) {
		this.caso=caso;
		this.paisActual=caso.getPaisDelRobo();
		this.paisAnterior=null;
		this.tengoOrdenDeArresto=false;
	}
	
	public void viajarAlProximoDestino(Pais pais) {
		try {
			if(!estoyEnEsePais(pais)&& puedeViajarAlProximoPais(pais)) {
				setPaisAnterior(paisActual);
				setPaisActual(pais);
			}	
		}
		catch(Exception NoPuedoViajarAEsePaisExceptiono) {}
	}

	private void setPaisAnterior(Pais pais) {
		this.paisAnterior=pais;
		
	}

	private boolean puedeViajarAlProximoPais(Pais pais) {
		return paisActual.tieneConexionAereaCon(pais) && pais.tieneConexionAereaCon(paisActual) ;
	}

	private boolean estoyEnEsePais(Pais pais) {
		return pais.equals(paisActual);
	}
	public void viajarAlProximoLugarDeInteres(LugarDeInteres lugar) {
		try {
			//if(!esDondeEstoyParado(lugar)) {
				setLugarDeInteresActual(lugar);
			//}
		}
		catch (Exception e) {
			throw new YaSeEncuentraEnElLugarException();
		}
		
	}
	
	public void pedirPista(LugarDeInteres lugar) {
		lugar.darPista(caso);
	}

	private boolean esDondeEstoyParado(LugarDeInteres lugar) {
		return lugar.equals(lugar);
	}
	public void pedirOrdenDeArresto(Villano villano) {
		if(!tengoOrdenDeArresto) {
			this.posibleSospechoso=villano;		
			this.tengoOrdenDeArresto=true;
		}
		/// agregar una excepcion si ya pidio la orden
	}

	public boolean tieneLaOrdenDeArrestoCorrecta() {
		return posibleSospechoso.equals(caso.getVillanoPosta());
	}

	public LugarDeInteres ultimoLugarDeInteresDondeEstaElVillano() {
		Villano villano=caso.getVillanoPosta();
		return villano.getUltimoLugarDEInteres();
	}
	public boolean estaEnElMismoLugarQueElSospechoso() {
		LugarDeInteres lugar=ultimoLugarDeInteresDondeEstaElVillano();
		return lugarActual.equals(lugar);
	}

/*
 * /// estaba en private pero se cambio a publico para testear
 * el funcionamiento del mismo
 */
	public Pais ultimoPaisDondeEsaElVillano() {
		return ultimoLugarDeInteresDondeEstaElVillano().getPaisDeOrigenDelLugar();
	}
	public void setPaisActual(Pais paisActual) {
		this.paisActual = paisActual;
	}

	public Pais getPaisActual() {
		return paisActual;
	}

	public void setLugarDeInteresActual(LugarDeInteres lugar) {
		this.lugarActual=lugar;
		
	}
	
	public void resolverCaso() {
		if(tieneLaOrdenDeArrestoCorrecta()){
			if(estaEnElMismoLugarQueElSospechoso()) {
				caso.getVillanoPosta().setEstaArrestado(true);
				caso.setEstaCerrado(true);
				//throw new GanoElJuego();
			}
			else {
				throw new NoSeEncuentraEnEseLugarElVillano();
			}
		}
		else {
			throw new NoTieneLaOrdenDeArrestoCorrecta();
			//throw new PerdioElJuego();
		}
	}
	
	
	
}

 
