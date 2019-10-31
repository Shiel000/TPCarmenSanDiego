package lugaresDeInteres;

import modelo.Pista;

public class Banco extends LugarDeInteres{
	
	@Override
	public Pista darPistas() {
		Pista pistasADar=new Pista();
		if(tienePistaDelMalechor()) {
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().getSeniasParticulares()));
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().darCaracteristicasDelProximoPais()));
		}
		return pistasADar;
	}

}

