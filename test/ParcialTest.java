package test;

import logica.Parcial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParcialTest {
	
	private Parcial parcial;
	private int b;
	private int e;
	
	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial(b, e);
	}

	@Test
	public void potenciaTest() throws Exception {
		assertEquals(8, this.parcial.potencia(2, 3));
		Exception e1 = assertThrows(Exception.class, () -> this.parcial.potencia(0,0));
		assertEquals("Se indetermina", e1.getMessage());
		
		Exception e2 = assertThrows(Exception.class, () -> this.parcial.potencia(-2, 3));
		assertEquals("Base o exponente negativos", e2.getMessage());
		
		Exception e3 = assertThrows(Exception.class, () -> this.parcial.potencia(2147483647, 2));
		assertEquals("Supera el maximo de un entero", e3.getMessage());
	}
}

	

