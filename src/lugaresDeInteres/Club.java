package lugaresDeInteres;

import modelo.Pista;

public class Club extends LugarDeInteres{
	@Override
	public Pista darPistas() {
		Pista pistasADar=new Pista();
		double probabilidadPistaExtra = 70;
		if(tienePistaDelMalechor()) {
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().getSeniasParticulares()));
			pistasADar.agregarPista(getPistas(getVillanoEnElLugar().getSeniasParticulares()));
			if(tengoChancesMayoresA(probabilidadPistaExtra)) {
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


