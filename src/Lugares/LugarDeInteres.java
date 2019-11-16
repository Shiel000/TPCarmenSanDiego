package Lugares;

import excepciones.NoHayPistasException;
import modelo.Caso;
import modelo.Pais;

public abstract class LugarDeInteres {
	
	protected Pais paisDeOrigenDelLugar;
	

	protected String pista= "";
	
	protected boolean villanoEstuvoAqui;

	protected abstract String getPistas(Caso caso, String pista,Pais paisDeOrigenDelLugar);
	
	public String darPista(Caso caso){
		if(estuvoElVillanoAqui()) {
			return getPistas(caso,pista,paisDeOrigenDelLugar);
		}
		throw new NoHayPistasException();
	}
	
	public boolean estuvoElVillanoAqui() {
		return villanoEstuvoAqui;
	}
	public Pais getPaisDeOrigenDelLugar() {
		return paisDeOrigenDelLugar;
	}
	public void setVillanoEstuvoAqui(boolean estuvo) {
		villanoEstuvoAqui=estuvo;
		
	}
	public void setPaisDeOrigenDelLugar(Pais paisDeOrigenDelLugar) {
		this.paisDeOrigenDelLugar = paisDeOrigenDelLugar;
	}	
	
}
