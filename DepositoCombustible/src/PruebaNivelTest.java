import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaNivelTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,5.0);
		assertEquals(5.0,0,tank.getDepositoNivel());
		
	}

}
