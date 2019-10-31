package excepciones;

public class NoHayPistasEXception extends RuntimeException  {
	
	private static final long serialVersionUID = 1L;

	public NoHayPistasEXception() {
		super("no hay pistas del sospechoso");
	}

}
