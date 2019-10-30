package modelo;
import java.util.List;


public class Biblioteca extends LugarDeInteres {
	private static final double PROBABILIDAD_QUE_SALGA_UNA_PISTA_MAS = 50.0; 
	@Override
	public List<String> darPista(Caso caso) throws NoHayPistasEXception {
		if(tienePistaDelMalechor(caso)) {
			List<String> combinacionDeCaracteristicas = null;
			combinacionDeCaracteristicas.addAll(caso.getResponsable().darSeniasParticulares(2));
			combinacionDeCaracteristicas.addAll(paisDeOrigen.darCaracteristicas(2));
			if(tengoChancesMayoresA(PROBABILIDAD_QUE_SALGA_UNA_PISTA_MAS)) {
				combinacionDeCaracteristicas.addAll(caso.getResponsable().darHobbies(1));
			}
			//
			return combinacionDeCaracteristicas;
		}
	throw new NoHayPistasEXception ("no se ha visto al sujeto en cuestion");
	}
	
	
	private Boolean tengoChancesMayoresA(double probabilidad) {
		double numeroAlAzar = Math.random();
		return numeroAlAzar>=probabilidad;
	}
}
