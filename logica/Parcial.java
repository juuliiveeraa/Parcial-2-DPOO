package logica;

public class Parcial  {

    public int b;
    public int e;        
        
    public Parcial(int b, int e){
        this.b = b;
        this.e = e;
    }

    public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

        
    public int potencia(int b, int e) throws ParcialException{
        int result = (int) Math.pow(b, e);
        if (b < 0 || e < 0) {
            throw new ParcialException(ParcialException.EXPO_NEGATIVA);
        }
        if (b == 0 && e == 0) {
            throw new ParcialException(ParcialException.INDETERMINADO);
        }

        if (result > 2147483647){
            throw new ParcialException(ParcialException.MAXIMO_ENTERO);
        }
        if (e == 0) {
            return 1;
        }
        if (b == 0) {
            return 0;
        }
       return result;
    }  
}

