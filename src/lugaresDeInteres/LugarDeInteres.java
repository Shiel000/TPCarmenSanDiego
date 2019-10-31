package lugaresDeInteres ;
import java.util.List;

import excepciones.NoHayPistasEXception;
import modelo.Caso;
import modelo.Pais;
import modelo.Pista;

public abstract class LugarDeInteres {
	
	private String nombre;
	
	public Pais paisDeOrigen;
	
	public abstract Pista darPistas(Caso caso);
	
	public boolean tienePistaDelMalechor(Caso caso){
		return caso.planDeEscapeDelSospechoso.contains(paisDeOrigen);
	}

	public Pais getPaisDeOrigen() {
		return paisDeOrigen;
	}
	public void setPaisDeOrigen(Pais paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}
}