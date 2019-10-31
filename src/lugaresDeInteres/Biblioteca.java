package lugaresDeInteres;

import excepciones.NoHayPistasException;
import modelo.Pista;

public class Biblioteca extends LugarDeInteres {
	
	@Override
	public Pista darPistas() {
		Pista pistasADar=new Pista();
		double probabilidadPistaExtra = 50.0;
		if(tienePistaDelMalechor()) {
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().getSeniasParticulares()));
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().getSeniasParticulares()));
			if(tengoChancesMayoresA(probabilidadPistaExtra)) {
				pistasADar.agregarPista(getPistas(getVillanoEnElLugar().getHobbies()));
			}
			return pistasADar;
		}
		throw new NoHayPistasException();
	}
	
	private Boolean tengoChancesMayoresA(double probabilidad) {
		double numeroAlAzar = Math.random();
		return numeroAlAzar>=probabilidad;
	}
}

