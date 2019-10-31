package excepciones;

public class PerdioElJuegoException extends RuntimeException {
private static final long serialVersionUID = 1L;
	
	public PerdioElJuegoException () { super("Usted ha perdido el juego"); }

}
