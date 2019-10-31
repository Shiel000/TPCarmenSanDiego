package lugaresDeInteres;

import java.util.List;

import modelo.Caso;
import modelo.Pista;

public class Club extends LugarDeInteres{
	private static final double PROBABILIDAD_QUE_SALGA_UNA_PISTA_MAS = 70.0; 
	@Override
	public Pista darPistas() {
		Pista pistasADar=new Pista();
		if(tienePistaDelMalechor()) {
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().getSeniasParticulares()));
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().getSeniasParticulares()));
			if(tengoChancesMayoresA(PROBABILIDAD_QUE_SALGA_UNA_PISTA_MAS)) {
				pistasADar.agregarPista(getPistas(getVillanoEnElLugar().getHobbies()));
			}
		}
		return pistasADar;
	}

	private Boolean tengoChancesMayoresA(double probabilidad) {
		double numeroAlAzar = Math.random();
		return numeroAlAzar>=probabilidad;
	}
}


