package excepciones;

public class NoPuedoIrAEseLugarException extends RuntimeException  {
	
	private static final long serialVersionUID = 1L;
	
	public NoPuedoIrAEseLugarException() {
		super("no puede viajar al lugar donde ya estas parado");
	}

	
}
