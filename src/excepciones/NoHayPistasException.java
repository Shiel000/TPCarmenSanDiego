package excepciones;

public class NoHayPistasException extends RuntimeException  {
	
	private static final long serialVersionUID = 1L;

	public NoHayPistasException() { super("No hay pistas del sospechoso."); }
}
