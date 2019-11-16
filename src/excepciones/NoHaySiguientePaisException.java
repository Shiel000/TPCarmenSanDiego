package excepciones;

public class NoHaySiguientePaisException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NoHaySiguientePaisException() { 
		super("No hay siguiente pais, este es el ultimo");
	}

}
