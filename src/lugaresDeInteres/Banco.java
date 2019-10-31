package lugaresDeInteres;

import java.util.List;

import modelo.Caso;

public class Banco extends LugarDeInteres{

	@Override
	public List<String> darPistas(Caso caso) {
		if(tienePistaDelMalechor(caso)) {
			List<String> combinacionDeCaracteristicas = null;
			combinacionDeCaracteristicas.addAll(caso.getResponsable().darSeniasParticulares(1));
			combinacionDeCaracteristicas.addAll(paisDeOrigen.darCaracteristicas(1));
			return combinacionDeCaracteristicas;
		}
		return null;
	}

}
