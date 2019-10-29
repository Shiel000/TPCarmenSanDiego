package Tp;
import java.util.List;

public class Biblioteca extends LugarDeInteres {
	@Override
	public List<String> darPista(Caso caso) {
		if(tienePistaDelMalechor(caso)) {
			//falta lo del 50%
			List<String> combinacionDeCaracteristicas = null;
			combinacionDeCaracteristicas.addAll(caso.getResponsable().darSeniasParticulares(2));
			combinacionDeCaracteristicas.addAll(paisDeOrigen.darCaracteristicas(2));
			
			return combinacionDeCaracteristicas;
		}
	return null;
	}
}
