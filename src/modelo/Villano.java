package modelo;
import java.util.*;

public class Villano{
	private String nombre;
	private String sexo;
	private List<String>seniasParticulares;
	private List<String>hobbies;
	
	public List<String>darSeniasParticulares(int cantidadDeSenias) {
		List<String> caracteristicasDelVillano= null;
		for(int i=0;i<cantidadDeSenias;i++) {
			caracteristicasDelVillano.add(seniasParticulares.get(i));
		}
		return caracteristicasDelVillano;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean estaCapturado() {
		return false;
	}
	public Collection<? extends String> darHobbies(int cantidadHobbies) {
		List<String> hobbiesVillano = null;
		for(int i=0;i<cantidadHobbies;i++) {
			hobbiesVillano.add(hobbies.get(i));
		}
		return hobbiesVillano;
	}
}
