package lugaresDeInteres;
import java.util.List;
import modelo.Pista;

public class Embajada extends LugarDeInteres {
	@Override
	public Pista darPistas() {
		Pista pistasADar=new Pista();
		if(tienePistaDelMalechor()) {
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().darCaracteristicasDelSiguientePaisEnLARutaDeEscape()));
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().darCaracteristicasDelSiguientePaisEnLARutaDeEscape()));
		}
		return pistasADar;
	}


}

