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
			
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().darCaracteristicasDelProximoPais()));		
		}
		return pistasADar;
	}

	private String getPistas(List<String> caracteristicas) {
		return caracteristicas.get(getRandom(caracteristicas.size()));
		
	}

	private int getRandom(int tamaño) {
		
		return (int) (Math.random()*tamaño);
	}
}
