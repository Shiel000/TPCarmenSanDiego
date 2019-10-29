package Tp;
import java.util.*;

public class Pais {
	private String nombrePais;
	private List<String>caracteristicasDelPais;
	private List<LugarDeInteres>lugaresInteres;
	private List<Pais>paisesConConexionAerea;
	
	public Pais(String nombrePais) {
		//constructor de pais
		this.nombrePais= nombrePais;
		this.paisesConConexionAerea=new ArrayList<Pais>();
		this.caracteristicasDelPais=new ArrayList<String>();
		this.lugaresInteres =new ArrayList<LugarDeInteres>();		
	}

	public void setConexion(Pais pais) {
		paisesConConexionAerea.add(pais);
		
	}
	public List<Pais> getConexiones() {
		return paisesConConexionAerea;
	}
		
	public List<Pais> getPaisesConConexionAerea() {
		return paisesConConexionAerea;
	}
	
	public void setPaisesConConexionAerea(Pais pais) {
		this.paisesConConexionAerea.add(pais);
	}

	public boolean tieneConexionAereaCon(Pais otroPais) {
		return this.getConexiones().contains(otroPais)&&otroPais.getConexiones().contains(this);
	}
	
	public void setCaracteristicas(String caracteristica) {
		caracteristicasDelPais.add(caracteristica);
		
	}
	public List<String> darCaracteristicas(int cantidadCaracteristicasaDar){
		List<String> caracteristicasADar = null;
		for(int i=0;i<cantidadCaracteristicasaDar;i++) {
			caracteristicasADar.add(caracteristicasDelPais.get(i));
		}
		return caracteristicasADar;
	}
	
}
