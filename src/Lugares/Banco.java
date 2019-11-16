package Lugares;

import modelo.Caso;
import modelo.Pais;

public class Banco extends LugarDeInteres {

	@Override
	protected String getPistas(Caso caso, String pista,Pais paisDeOrigenDelLugar) {
		String pistaSenias = caso.getSeniasParticularesDelVillano();
		String pistaProximoPais = caso.getCaracteristicasDelProximoPaisDelVillano(paisDeOrigenDelLugar); 
		pista = pistaSenias + "," +pistaProximoPais;
		return pista;
	}
	
}
