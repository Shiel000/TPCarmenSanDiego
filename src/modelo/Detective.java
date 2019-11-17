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
		if(!estoyEnEsePais(pais)&& puedeViajarAlProximoPais(pais)) {
			setPaisAnterior(paisActual);
			setPaisActual(pais);
		}
		else {
			throw new NoPuedoViajarAEsePaisException();
		}
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
		if(!esDondeEstoyParado(lugar)) {
			setLugarDeInteresActual(lugar);
			//pedirPista(lugar);
		}
		else {
			throw new YaSeEncuentraEnElLugarException();
		}

	}
	
	public void pedirPista(LugarDeInteres lugar) {
		lugar.darPista(caso);
	}

	private boolean esDondeEstoyParado(LugarDeInteres lugar) {
		return lugar.equals(lugarActual);
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
			}
			else {
				throw new NoSeEncuentraEnEseLugarElVillano();
			}
		}
		else {
			throw new NoTieneLaOrdenDeArrestoCorrecta();
		}
	}
	
	
	
}

 
