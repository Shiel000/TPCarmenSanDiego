package Lugares;

import modelo.Caso;
import modelo.Pais;


public class Biblioteca extends LugarDeInteres {
	
	public static final double PROBABILIDAD_EXTRA = 50.0;
	

	@Override
	protected String getPistas(Caso caso, String pista, Pais paisDeOrigenDelLugar) {
		String pistaSenia1=caso.getSeniasParticularesDelVillano();
		String pistaPaisSiguiente=caso.getCaracteristicasDelProximoPaisDelVillano(paisDeOrigenDelLugar);
		pista += pistaSenia1+"\n "+ "\n"+pistaPaisSiguiente;
		if(tengoChancesMayoresA()) {
			String pistaHobbies=caso.getHobbiesDelVillano();
			pista += "\n "+pistaHobbies;
		}
		return pista;
	}
	
	public Boolean tengoChancesMayoresA() {
		double numeroAlAzar = Math.random();
		return numeroAlAzar>=PROBABILIDAD_EXTRA;
	}


}

