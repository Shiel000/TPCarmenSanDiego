package lugaresDeInteres;

import java.util.ArrayList;
import java.util.List;

import modelo.Caso;
import modelo.Pais;
import modelo.Pista;

public class Embajada extends LugarDeInteres {
	@Override
	public Pista darPistas() {
		Pista pistasADar=new Pista();
		if(tienePistaDelMalechor()) {
			
			pistasADar.agregarPista((getVillanoEnElLugar().darCaracteristicasDelProximoPais()));		
		}
		return pistasADar;
	}
}
