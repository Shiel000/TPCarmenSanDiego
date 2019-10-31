package lugaresDeInteres;

import java.util.ArrayList;
import java.util.List;

import modelo.Caso;
import modelo.Pais;
import modelo.Pista;
import modelo.PistaPorPais;

public class Embajada extends LugarDeInteres {
	@Override
	public Pista darPistas(Caso caso) {
		
		Pista pistasADar=new PistaPorPais();
		if(tienePistaDelMalechor(caso)) {
			pistasADar.getPistasAdar(caso);
			
		}
		
		/*if(tienePistaDelMalechor(caso)) {
			ArrayList<Pais>rutaEscape=(ArrayList<Pais>)caso.getPlanDeEscapeDelSospechoso();
			Pais siguientePais =rutaEscape.get(buscoElIndiceDelProximoPais(rutaEscape));
			pistasADar=(Pista) siguientePais.darCaracteristicas(2);
			}
	}
}

	private int buscoElIndiceDelProximoPais (ArrayList<Pais> rutaEscape) {
		int indiceDelSiguientePais;
		for(int i=0;i<rutaEscape.size();i++) {
			if(rutaEscape.get(i).equals(paisDeOrigen)&& !esElUltimoElementoDeLaLista(rutaEscape.get(i),rutaEscape)) {
				indiceDelSiguientePais = i+1;
			}
		}	
		return indiceDelSiguientePais;
	}
	
	
	
	private boolean esElUltimoElementoDeLaLista(Pais pais, ArrayList<Pais> rutaEscape) {
		
		return rutaEscape.get(rutaEscape.size()-1).equals(pais);
	}
*/
	
}