package lugaresDeInteres;
import java.util.List;

import excepciones.NoHayPistasEXception;
import modelo.Caso;

public class Biblioteca extends LugarDeInteres {
	private static final double PROBABILIDAD_QUE_SALGA_UNA_PISTA_MAS = 50.0; 
	
	@Override
	public List<String> darPistas(Caso caso) {
		if(tienePistaDelMalechor(caso)) {
			List<String> combinacionDeCaracteristicas = null;
			combinacionDeCaracteristicas.addAll(caso.getSospechoso().darSeniasParticulares(2));
			combinacionDeCaracteristicas.addAll(paisDeOrigen.darCaracteristicas(2));
			if(tengoChancesMayoresA(PROBABILIDAD_QUE_SALGA_UNA_PISTA_MAS)) {
				combinacionDeCaracteristicas.addAll(caso.getSospechoso().darHobbies(1));
			}
			return combinacionDeCaracteristicas;
		}
		throw new NoHayPistasEXception();
	}
	
	
	private Boolean tengoChancesMayoresA(double probabilidad) {
		double numeroAlAzar = Math.random();
		return numeroAlAzar>=probabilidad;
	}
}
