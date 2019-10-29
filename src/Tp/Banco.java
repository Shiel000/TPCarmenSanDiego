package Tp;

import java.util.List;

public class Banco extends LugarDeInteres{

	@Override
	public List<String> darPista(Caso caso) {
		if(tienePistaDelMalechor(caso)) {
			//uso el addAll porquela lista que me devuelve tanto el darSenias y darCaracteristicas 
			//son con 1 elemento (el cual le indico yo con el 1) 
			List<String> combinacionDeCaracteristicas = null;
			combinacionDeCaracteristicas.addAll(caso.getResponsable().darSeniasParticulares(1));
			combinacionDeCaracteristicas.addAll(paisDeOrigen.darCaracteristicas(1));
			
			return combinacionDeCaracteristicas;
			
		}
		return null;
	}

}
