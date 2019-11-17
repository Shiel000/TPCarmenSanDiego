package excepciones;

public class NoSeEncuentraEnEseLugarElVillano extends  RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public NoSeEncuentraEnEseLugarElVillano() { 
		
		super("EL VILLANO NO SE ENCUENTRA AQUI.");
		
	}
}
