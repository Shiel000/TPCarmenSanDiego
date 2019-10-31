package lugaresDeInteres;

import java.util.List;

import modelo.Caso;
import modelo.Pista;

public class Banco extends LugarDeInteres{
	
	@Override
	public Pista darPistas() {
		Pista pistasADar=new Pista();
		if(tienePistaDelMalechor()) {
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().getSeniasParticulares()));
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().darCaracteristicasDelSiguientePaisEnLARutaDeEscape()));
		}
		return pistasADar;
	}

}

