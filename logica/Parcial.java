package logica;

public class Parcial  {

    public int b;
    public int e;        
        
    public Parcial(int b, int e){
        this.b = b;
        this.e = e;
    }
        
    public int potencia(int b, int e) throws parcialException{
        int result = (int) Math.pow(b, e);
        if (b < 0 || e < 0) {
            throw new parcialException(parcialException.EXPO_NEGATIVA);
        }
        if (b == 0 && e == 0) {
            throw new parcialException(parcialException.INDETERMINADO);
        }

        if (result > 2147483647){
            throw new parcialException(parcialException.MAXIMO_ENTERO);
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

