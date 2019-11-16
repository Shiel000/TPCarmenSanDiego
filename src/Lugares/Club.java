package Lugares;

import modelo.Caso;
import modelo.Pais;

public class Club extends LugarDeInteres {
	public static final double PROBABILIDAD_EXTRA = 70.0;
	@Override
	protected String getPistas(Caso caso, String pista, Pais paisDeOrigenDelLugar) {
		String pistaSenia1=caso.getSeniasParticularesDelVillano();
		String pistaSenia2=caso.getSeniasParticularesDelVillano();
		String pistaPaisSiguiente=caso.getCaracteristicasDelProximoPaisDelVillano(paisDeOrigenDelLugar);
		pista += pistaSenia1+"\n "+pistaSenia2+ "\n"+pistaPaisSiguiente;
		if(tengoChancesMayoresA()) {
			String pistaHobbies=caso.getHobbiesDelVillano();
			pista += "\n "+pistaHobbies;
		}
		return pista;
	}
	
	private Boolean tengoChancesMayoresA() {
		double numeroAlAzar = Math.random();
		return numeroAlAzar>=PROBABILIDAD_EXTRA;
	}


}
