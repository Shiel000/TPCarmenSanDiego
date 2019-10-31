package lugaresDeInteres;
import java.util.List;
import modelo.Pista;

public class Embajada extends LugarDeInteres {
	@Override
	public Pista darPistas() {
		Pista pistasADar=new Pista();
		if(tienePistaDelMalechor()) {
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().darCaracteristicasDelProximoPais()));
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().darCaracteristicasDelProximoPais()));
		}
		return pistasADar;
	}


}

