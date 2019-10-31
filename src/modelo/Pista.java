package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pista {
	private List<String> pistasAdar=new ArrayList<String>();

	public List<String> getPistasAdar(Caso caso) {
		return pistasAdar;
	}

	public void setPistasAdar(List<String> pistasAdar) {
		this.pistasAdar = pistasAdar;
	}

}
