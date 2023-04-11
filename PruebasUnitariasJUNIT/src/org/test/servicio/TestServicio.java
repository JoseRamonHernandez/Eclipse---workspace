package org.test.servicio;


import org.ejemplo.servicio.ServicioEmpleado;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class TestServicio extends TestCase {
	
	ServicioEmpleado servicioEmpleado;

	@Test
	void test() {
	 servicioEmpleado = new ServicioEmpleado();
	}

	@Test
	public void testBono() {
		test();
		assertEquals(servicioEmpleado.salarioBono(20000.0, 4000.0), 4000.0);
	}
	
	
	
	@Test
	public void testSalarioPrestamo() {
		test();
		assertTrue(20000.0==servicioEmpleado.salarioPerstamo(24000.0,  4000.0));
	}
}
