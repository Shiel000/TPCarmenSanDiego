package excepciones;

public class perdioElJuegoException extends RuntimeException {
private static final long serialVersionUID = 1L;
	
	public perdioElJuegoException () {
		super("Usted ha perdido el juego");
		
	}

}
