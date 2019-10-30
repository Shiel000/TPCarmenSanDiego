package modelo;
import java.util.List;


public class Biblioteca extends LugarDeInteres {
	private static final int PROBABILIDAD_QUE_SALGA_UNA_PISTA_MAS = 50; 
	@Override
	public List<String> darPista(Caso caso) throws NoHayPistasEXception {
		if(tienePistaDelMalechor(caso)) {
			List<String> combinacionDeCaracteristicas = null;
			combinacionDeCaracteristicas.addAll(caso.getResponsable().darSeniasParticulares(2));
			combinacionDeCaracteristicas.addAll(paisDeOrigen.darCaracteristicas(2));
			if(tengoChancesMayoresalCincuentaPorciento()) {
				combinacionDeCaracteristicas.addAll(caso.getResponsable().darHobbies(1));
			}
			
			return combinacionDeCaracteristicas;
		}
	throw new NoHayPistasEXception ("no se ha visto al sujeto en cuestion");
	}
	private Boolean tengoChancesMayoresalCincuentaPorciento() {
		double numeroAlAzar = Math.random();
		return numeroAlAzar>PROBABILIDAD_QUE_SALGA_UNA_PISTA_MAS;
	}
}
