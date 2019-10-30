package modelo ;
import java.util.List;

import modelo.Pais;

public abstract class LugarDeInteres {
	public Pais paisDeOrigen;
	public abstract List<String> darPista(Caso caso);
	
	public boolean tienePistaDelMalechor(Caso caso){
		return caso.planDeEscape.contains(paisDeOrigen);
	}
	
}
