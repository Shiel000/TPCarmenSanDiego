package modelo;

public class Juego {
	private Caso casoAresolver;
	private Detective miDetective;
	
	public Juego(Caso caso, Detective detective ) {
		this.casoAresolver=caso;
		this.miDetective=detective;

	}
	
	
	
	
	public boolean resolvioElCaso() {
		return miDetective.tieneLaOrdenDeArrestoCorrecta() && miDetective.estaEnElMismoLugarQueElSospechoso();
	}
	

	public void setDetective(Detective detective) {
		miDetective=detective;
	}
	
	public void setCasoAresolver(Caso caso) {
		casoAresolver=caso;
	}
}
