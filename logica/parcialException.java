package logica;

public class parcialException extends Exception {
    private int exception;
	public final static int EXPO_NEGATIVA = 1;
	public final static int INDETERMINADO = 2;
	public final static int MAXIMO_ENTERO = 3;

	
	    public parcialException(int exception) {
		    this.exception = exception;
	    }
	

    public parcialException(String msg) {
        super(msg);
    }
}
	
	@Override
	public String getMessage() {
		if(this.exception == EXPO_NEGATIVA) {
			return "Base o exponente negativos";
		}
        else if (this.exception == INDETERMINADO) {
            return "Se indetermina";
		}
        else if (this.exception == MAXIMO_ENTERO) {
            return "Supera el maximo de un entero";{
		}
		return null;
	}
}

        
