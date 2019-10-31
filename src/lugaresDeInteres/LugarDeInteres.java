package lugaresDeInteres ;
import java.util.List;

import excepciones.NoHayPistasEXception;
import modelo.Caso;
import modelo.Pais;
import modelo.Pista;
import modelo.Villano;

public abstract class LugarDeInteres {
	
	private String nombre;
	
	public Pais paisDeOrigen;

	private Villano villanoEnElLugar;

	public abstract Pista darPistas();

	public boolean tienePistaDelMalechor(){
		return villanoEnElLugar.getPlanDeEscape().contains(paisDeOrigen);
	}

	public Pais getPaisDeOrigen() {
		return paisDeOrigen;
	}
	public void setPaisDeOrigen(Pais paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}

	public Villano getVillanoEnElLugar() {
		return villanoEnElLugar;
	}

	public void setVillanoEnElLugar(Villano villanoEnElLugar) {
		this.villanoEnElLugar = villanoEnElLugar;
	}
	public String getPistas(List<String> caracteristicas) {
		return caracteristicas.get(getRandom(caracteristicas.size()));
		
	}

	private int getRandom(int tamaño) {
		
		return (int) (Math.random()*tamaño);
	}
	
	
}