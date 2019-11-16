package modelo;
import java.util.ArrayList;
import Lugares.LugarDeInteres;
import random.numeroRandom;


public class Pais {
	private String nombrePais;
	private ArrayList<String>caracteristicasDelPais;
	private ArrayList<LugarDeInteres>lugaresInteres;
	private ArrayList<Pais>paisesConConexionAerea;

	public Pais(String nombre) {
		nombrePais=nombre;
		this.caracteristicasDelPais=new ArrayList<String>();
		this.paisesConConexionAerea=new ArrayList<Pais>();
		this.lugaresInteres=new ArrayList<LugarDeInteres>();
	}

	public String obtenerCaracteristicaDelPais() {
		numeroRandom indice = new numeroRandom();
		return getCaracteristicaDelPais().get(indice.getRandom(getCaracteristicaDelPais().size()));
	}
	private ArrayList<String> getCaracteristicaDelPais() {
		
		return caracteristicasDelPais;
	}

	public boolean tieneConexionAereaCon(Pais pais) {
		return (this.getPaisesConConexionAerea().contains(pais)&&pais.getPaisesConConexionAerea().contains(this));
	}
	
	
	public ArrayList<Pais> getPaisesConConexionAerea() {
		return paisesConConexionAerea;
	}
	public void agregarConexionAerea(Pais pais) {
		this.paisesConConexionAerea.add(pais);
		pais.paisesConConexionAerea.add(this);
	}

	public void setCaracteristicas(String caracteristica) {
		caracteristicasDelPais.add(caracteristica);
	}

}
