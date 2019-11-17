package modelo;
import java.util.*;

import Lugares.LugarDeInteres;
import excepciones.NoHaySiguientePaisException;
import random.numeroRandom;

public class Villano{
	protected String nombre;
	protected  String sexo;
	protected  ArrayList<String>seniasParticulares;
	protected  ArrayList<String>hobbies;
	protected  ArrayList<Pais>rutaDeEscape;
	protected  Pais ultimoPaisDondeEsta;
	protected  LugarDeInteres ultimoLugarDEInteres;
	protected  boolean estaArrestado;
	
	public Villano(String nombre,String sexo,LugarDeInteres ultmimo){
		this.nombre=nombre;
		this.sexo=sexo;
		seniasParticulares=new ArrayList<String>();
		this.hobbies=new ArrayList<String>();
		rutaDeEscape=new ArrayList<Pais>();
		ultimoLugarDEInteres= ultmimo;
		ultimoPaisDondeEsta= ultimoLugarDEInteres.getPaisDeOrigenDelLugar();
		estaArrestado=false;
	
	}
	
	public String obtenerSeniaParticular() {
		numeroRandom indice = new numeroRandom();
		return seniasParticulares.get(indice.getRandom(seniasParticulares.size()));
	}
	public String obtenerHobbies() {
		numeroRandom indice = new numeroRandom();
		return hobbies.get(indice.getRandom(hobbies.size()));
		
	}

	public String obtenerCaracteristicaDelProximoPais(Pais pais) {
		Pais siguientePais= rutaDeEscape.get(buscoElProximoIndiceDelProximoPais(pais));
		return siguientePais.obtenerCaracteristicaDelPais();
	}

	public int buscoElProximoIndiceDelProximoPais(Pais pais) {
		int indiceDelSiguientePais = 0;
		for(int i=0;i<rutaDeEscape.size();i++) {
			if(rutaDeEscape.get(i).equals(pais)&& !esElUltimoElementoDeLaLista(rutaDeEscape.get(i),rutaDeEscape)) {
				indiceDelSiguientePais = i+1;
			}
			if(rutaDeEscape.get(i).equals(pais)&& esElUltimoElementoDeLaLista(rutaDeEscape.get(i),rutaDeEscape)){
				throw new NoHaySiguientePaisException();
			}
		}	
		return indiceDelSiguientePais;
}

	public boolean esElUltimoElementoDeLaLista(Pais pais, ArrayList<Pais> rutaDeEscape2) {
		return rutaDeEscape.get(rutaDeEscape.size()-1).equals(pais);
	}

	public LugarDeInteres getUltimoLugarDEInteres() {
		return ultimoLugarDEInteres;
	}
	
	public void agregarPaisAlaRutaDeEscape(Pais pais) {
		rutaDeEscape.add(pais);
	}
	
	public void setRutaDeEscape(ArrayList<Pais> rutaDeEscape) {
		this.rutaDeEscape = rutaDeEscape;
	}
	public ArrayList<Pais> getRutaDeEscape(){
		return rutaDeEscape;
		
	}
	public ArrayList<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}


	public void agregarSeniasParticulares(String senia) {
		seniasParticulares.add(senia);
		
	}
	public void agregarHobbies(String hobbie) {
		hobbies.add(hobbie);
		
	}

	public void setEstaArrestado(boolean condicion) {
		estaArrestado = condicion;
		
	}
	
	
}


		
