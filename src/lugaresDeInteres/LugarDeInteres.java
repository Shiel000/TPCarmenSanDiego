package lugaresDeInteres ;
import java.util.List;

import excepciones.NoHayPistasEXception;
import modelo.Caso;
import modelo.Pais;

public abstract class LugarDeInteres {
	protected Pais paisDeOrigen;
	
	public abstract List<String> darPistas(Caso caso);
	
	public boolean tienePistaDelMalechor(Caso caso){
		return caso.planDeEscapeDelVillano.contains(paisDeOrigen);
	}
	
}