import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaVacioTest {
	
	   

	@Test
	public void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		double gasolina=10.0;
		tank.fill(gasolina);
		assertFalse(tank.getDepositoNivel()== 0);
		
	}

}
