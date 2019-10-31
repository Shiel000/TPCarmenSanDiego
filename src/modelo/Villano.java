package modelo;
import java.util.*;

import lugaresDeInteres.LugarDeInteres;

public class Villano{
	private String nombre;
	private String sexo;
	private List<String>seniasParticulares;
	private List<String>hobbies;
	private List<Pais>rutaDeEscape;
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
		setSeniasParticulares(new ArrayList<String>());
		setHobbies(new ArrayList<String>());
		rutaDeEscape=new ArrayList<Pais>();
		
	}
	public String getNombre() {
		return nombre;
	}
	public List<Pais> getPlanDeEscape() {
		return rutaDeEscape;
	}
	
	public void setRutaDeEscape(List<Pais> rutaDeEscape) {
		this.rutaDeEscape = rutaDeEscape;
	}
	
	public List<String> getHobbies() {
		return hobbies;
	}
	
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public List<String> getSeniasParticulares() {
		return seniasParticulares;
	}
	public void setSeniasParticulares(List<String> seniasParticulares) {
		this.seniasParticulares = seniasParticulares;
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
	
	
	public List<String>darCaracteristicasDelProximoPais(){
		Pais siguientePais =rutaDeEscape.get(buscoElIndiceDelProximoPais(rutaDeEscape,lugarActualDeInteresDelVillano.paisDeOrigen));
		return siguientePais.getCaracteristicasDelPais();
	}
	
	
	private int buscoElIndiceDelProximoPais (List<Pais> rutaEscape,Pais paisDeOrigen) {
		int indiceDelSiguientePais = 0;
		for(int i=0;i<rutaEscape.size();i++) {
			if(rutaEscape.get(i).equals(paisDeOrigen)&& !esElUltimoElementoDeLaLista(rutaEscape.get(i),rutaEscape)) {
				indiceDelSiguientePais = i+1;
			}
		}	
		return indiceDelSiguientePais;
	}

	private boolean esElUltimoElementoDeLaLista(Pais pais, List<Pais> rutaEscape) {
		return rutaEscape.get(rutaEscape.size()-1).equals(pais);
	}
	




}
