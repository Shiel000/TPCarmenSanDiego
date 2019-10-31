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
		seniasParticulares=new ArrayList<String>();
		hobbies=new ArrayList<String>();
		rutaDeEscape=new ArrayList<Pais>();
		
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
	

	public List<Pais> getPlanDeEscape() {
		return rutaDeEscape;
	}


}
