package lugaresDeInteres;
import java.util.List;

import excepciones.NoHayPistasEXception;
import modelo.Caso;
import modelo.Pista;

public class Biblioteca extends LugarDeInteres {
	private static final double PROBABILIDAD_QUE_SALGA_UNA_PISTA_MAS = 50.0; 
	
	@Override
	public Pista darPistas() {
		Pista pistasADar=new Pista();
		if(tienePistaDelMalechor()) {
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().getSeniasParticulares()));
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().getSeniasParticulares()));
			if(tengoChancesMayoresA(PROBABILIDAD_QUE_SALGA_UNA_PISTA_MAS)) {
				pistasADar.agregarPista(getPistas(getVillanoEnElLugar().getHobbies()));
			}
			return pistasADar;
		}
		throw new NoHayPistasEXception();
	}
	
	
	private Boolean tengoChancesMayoresA(double probabilidad) {
		double numeroAlAzar = Math.random();
		return numeroAlAzar>=probabilidad;
	}

}
