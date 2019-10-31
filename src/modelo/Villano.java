package modelo;
import java.util.*;

import lugaresDeInteres.LugarDeInteres;

public class Villano{
	private String nombre;
	private String sexo;
	private List<String>seniasParticulares;
	private List<String>hobbies;
	private LugarDeInteres lugarActualDeInteresDelVillano;

	private boolean estaCapturado;
	
	
	public boolean isEstaCapturado() {
		return estaCapturado;
	}
	public void setEstaCapturado(boolean estaCapturado) {
		this.estaCapturado = estaCapturado;
	}

	public Villano(String nombreVillano,String sexoVillano) {
		nombre=nombreVillano;
		sexo=sexoVillano;
		seniasParticulares=new ArrayList<String>();
		hobbies=new ArrayList<String>();
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public Pais getPaisActual() {
		return lugarActualDeInteresDelVillano.getPaisDeOrigen();
	}

	
	public LugarDeInteres getLugarDeInteresActualVillano() {
		return lugarActualDeInteresDelVillano;
	}
		
	public void setLugarActualDeInteresDelVillano(LugarDeInteres lugarActualDeInteresDelVillano) {
		this.lugarActualDeInteresDelVillano = lugarActualDeInteresDelVillano;
	}
	
	

	public List<String> darHobbies(int cantidadHobbies) {
		List<String> hobbiesVillano = null;
		for(int i=0;i<cantidadHobbies;i++) {
			hobbiesVillano.add(hobbies.get(i));
		}
		return hobbiesVillano;
	}
	public List<String>darSeniasParticulares(int cantidadDeSenias) {
		List<String> caracteristicasDelVillano= null;
		for(int i=0;i<cantidadDeSenias;i++) {
			caracteristicasDelVillano.add(seniasParticulares.get(i));
		}
		return caracteristicasDelVillano;
	}


}
