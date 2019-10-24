package Tp;

public class Mapa {
	
	Pais paisActual;
	
	
	public boolean tieneConexionAereaCon(Pais otroPais) {
		return paisActual.getConexiones().contains(otroPais)&&otroPais.getConexiones().contains(paisActual);
	}

}
