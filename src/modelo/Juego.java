package modelo;

public class Juego {
	private Detective miDetective;
	private Caso caso;
	private Villano miVillano;
	
	public boolean ganeEljuego() {
		
		return miDetective.tieneOrdenDeArrestoCorrecta(miVillano)&& miDetective.estoyEnElMismoLugarQueElVillano(miVillano);
	}
	
}


