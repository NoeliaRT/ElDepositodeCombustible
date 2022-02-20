import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaLLenadoTest {

	@Test
	public void testFill() {
		DepositoCombustible tank = new DepositoCombustible(40.0,10.0);
		double gasolina=10.0;
		tank.fill(gasolina);
		assertEquals(20.0,0,tank.getDepositoNivel());
	    
		
		
		
	}

}
