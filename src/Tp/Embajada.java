package Tp;

import java.util.List;

public class Embajada extends LugarDeInteres {
	@Override
	public List<String> darPista(Caso caso) {
	if(tienePistaDelMalechor(caso)) {
		return paisDeOrigen.darCaracteristicas(2);
		//
		}
	return null;
	}
}
