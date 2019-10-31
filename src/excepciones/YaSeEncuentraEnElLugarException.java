package excepciones;

public class YaSeEncuentraEnElLugarException extends RuntimeException  {
	
	private static final long serialVersionUID = 1L;
	
	public YaSeEncuentraEnElLugarException() { super("No se puede viajar al lugar donde ya estas."); }
}
