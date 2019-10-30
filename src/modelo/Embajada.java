package modelo;

import java.util.List;

public class Embajada extends LugarDeInteres {
	@Override
	public List<String> darPistas(Caso caso) {
	if(tienePistaDelMalechor(caso)) {
		return paisDeOrigen.darCaracteristicas(2);
		//
		}
	return null;
	}
}
