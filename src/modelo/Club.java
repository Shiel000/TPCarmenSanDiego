package modelo;

import java.util.List;

public class Club extends LugarDeInteres{
	@Override
	public List<String> darPistas(Caso caso) {
		//falta lo del 70% no se me ocurre como hacerlo
		
		if(tienePistaDelMalechor(caso)) {
			
			return caso.getResponsable().darSeniasParticulares(2);
		}
		return null;
	}

	private Boolean tengoChancesMayoresA(double probabilidad) {
		double numeroAlAzar = Math.random();
		return numeroAlAzar>=probabilidad;
	}
}
