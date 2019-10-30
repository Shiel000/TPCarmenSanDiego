package modelo ;
import java.util.List;

import modelo.Pais;

public abstract class LugarDeInteres {
	protected Pais paisDeOrigen;
	
	public abstract List<String> darPista(Caso caso) throws NoHayPistasEXception;
	
	public boolean tienePistaDelMalechor(Caso caso){
		return caso.planDeEscapeDelVillano.contains(paisDeOrigen);
	}
	
}
