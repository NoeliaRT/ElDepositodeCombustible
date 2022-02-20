import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaConsumoTest {

	@Test
	public void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		double gasolina=5.0;
		tank.consumir(gasolina);
		assertEquals(15.0,0,tank.getDepositoNivel());
	}

}
