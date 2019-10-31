package excepciones;

public class NoPuedoViajarAEsePaisException extends RuntimeException  {
	
	private static final long serialVersionUID = 1L;
	
	public NoPuedoViajarAEsePaisException () { super("No se puede viajar al siguiente pais, este y el actual no se encuentran conectados."); }
}
