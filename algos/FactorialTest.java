package algos;

import junit.framework.*;
import org.junit.Test;

public class FactorialTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void testFacto() throws Exception {
		assertEquals(1, Factorial.facto(0));
		assertEquals(1, Factorial.facto(1));
		assertEquals(2, Factorial.facto(2));
		assertEquals(6, Factorial.facto(3));
		assertEquals(24, Factorial.facto(4));
	}
}
