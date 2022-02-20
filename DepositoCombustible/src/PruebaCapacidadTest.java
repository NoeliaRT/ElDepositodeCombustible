import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaCapacidadTest {

	@Test
	void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(50.0,0.0);
		assertEquals(50.0,0,tank.getDepositoMax());
	}

}
