import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ePrincipalEjercicio3Test {

	//Creamos el obj comun para llamamar a la clase
	ePrincipalEjercicio3 principal = new ePrincipalEjercicio3();

	//Asignamos un nulo a las operaciones para que de error
	Integer i = null;
	
	@SuppressWarnings("static-access")
	@Test
	void testSumar() {
		
		 
		assertNotNull(principal.sumar(i, i));	
	}

	@SuppressWarnings("static-access")
	@Test
	void testRestar() {
		assertNotNull(principal.restar(i, i));	
	}

	@SuppressWarnings("static-access")
	@Test
	void testMultiplicar() {
		assertNotNull(principal.multiplicar(i, i));	
	}

}
