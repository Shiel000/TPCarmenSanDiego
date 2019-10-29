package Tp;

import java.util.List;

public class Club extends LugarDeInteres{
	@Override
	public List<String> darPista(Caso caso) {
		//falta lo del 70% no se me ocurre como hacerlo
		if(tienePistaDelMalechor(caso)) {
			return caso.getResponsable().darSeniasParticulares(2);
		}
		return null;
	}

}
