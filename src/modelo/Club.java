package modelo;

import java.util.List;

public class Club extends LugarDeInteres{
	private static final double PROBABILIDAD_QUE_SALGA_UNA_PISTA_MAS = 70.0; 
	@Override
	public List<String> darPistas(Caso caso) {
		List<String> combinacionDeCaracteristicas = null;
		if(tienePistaDelMalechor(caso)) {
			combinacionDeCaracteristicas.addAll(caso.getResponsable().darSeniasParticulares(2));
			if(tengoChancesMayoresA(PROBABILIDAD_QUE_SALGA_UNA_PISTA_MAS)) {
				combinacionDeCaracteristicas.addAll(caso.getResponsable().darHobbies(1));
			}
		}
		return combinacionDeCaracteristicas;
	}

	private Boolean tengoChancesMayoresA(double probabilidad) {
		double numeroAlAzar = Math.random();
		return numeroAlAzar>=probabilidad;
	}
}
