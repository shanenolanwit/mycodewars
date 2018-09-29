package shane.nolan.wit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SquareDigitExampleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(811181, new SquareDigit().squareDigits(9119));
		assertEquals(9414, new SquareDigit().squareDigits(3212));
		assertEquals(4114, new SquareDigit().squareDigits(2112));
	}

}
