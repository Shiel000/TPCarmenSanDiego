package excepciones;

public class NoTieneLaOrdenDeArrestoCorrecta extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public NoTieneLaOrdenDeArrestoCorrecta() { 
		
		super("LA ORDEN DE ARRESTRO SE ENCUNTRA BAJO EL NOMBRE DE UN CRIMINAL DISTINTO AL DEL CASO ");
		
	}

}
