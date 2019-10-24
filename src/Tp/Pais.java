package Tp;
import java.util.*;

public class Pais {
	private String nombrePais;
	private List<String>caracteristicasDelPais;
	private List<LugarDeInteres>lugaresInteres;
	private List<Pais>paisesConConexionAerea;
	
	public Pais() {
		paisesConConexionAerea=new ArrayList<Pais>();
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
	

	public List<String> darCaracteristicas(int cantidadCaracteristicasaDar){
		List<String> caracteristicasADar = null;
		for(int i=0;i<cantidadCaracteristicasaDar;i++) {
			caracteristicasADar.add(caracteristicasDelPais.get(i));
		}
		return caracteristicasADar;
	}
	
}
