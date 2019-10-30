package modelo ;
import java.util.List;

import modelo.Pais;

public abstract class LugarDeInteres {
	protected Pais paisDeOrigen;
	
	public abstract List<String> darPistas(Caso caso) throws NoHayPistasException;
	
	public boolean tienePistaDelMalechor(Caso caso){
		return caso.planDeEscapeDelVillano.contains(paisDeOrigen);
	}
	
}