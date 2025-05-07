package presentacion;

import logica.Parcial;
import logica.ParcialException;

public class Principal {
	private Parcial parcial;
	private int b;
	private int e;
	
	public Principal() {
		this.parcial = new Parcial(b, e);
		
		try {
			int b = 2;
			int e = 3;
			
			this.parcial.setB(b);
			this.parcial.setE(e);
			
			this.parcial.potencia(b, e);

			System.out.println("Base: " + this.parcial.getB());
			System.out.println("Exponente: " + this.parcial.getE());
			
			int resultado = this.parcial.potencia(b, e);
			System.out.println("Resultado: " + resultado);
		} 
		catch (ParcialException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Principal();
	}
}
