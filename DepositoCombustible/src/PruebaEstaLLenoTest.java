import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaEstaLLenoTest {

	@Test
	public void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		double gasolina=10.0;
		tank.fill(gasolina);
		assertFalse(tank.getDepositoNivel()== tank.getDepositoMax());
	}

}
