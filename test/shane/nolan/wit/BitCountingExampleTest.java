package shane.nolan.wit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class BitCountingExampleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(5, BitCounting.countBits(1234)); 
		assertEquals(1, BitCounting.countBits(4)); 
		assertEquals(3, BitCounting.countBits(7)); 
		assertEquals(2, BitCounting.countBits(9)); 
		assertEquals(2, BitCounting.countBits(10)); 
	}

}
