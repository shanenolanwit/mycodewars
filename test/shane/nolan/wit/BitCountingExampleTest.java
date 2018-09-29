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
		assertEquals(0, BitCounting.countBits(0)); 

		assertEquals(14, BitCounting.countBits(77231418)); 
		assertEquals(11, BitCounting.countBits(12525589)); 
		assertEquals(8, BitCounting.countBits(3811));
		assertEquals(17, BitCounting.countBits(392902058)); 
		assertEquals(3, BitCounting.countBits(1044)); 
		assertEquals(10, BitCounting.countBits(10030245)); 
		assertEquals(16, BitCounting.countBits(183337941)); 
		assertEquals(14, BitCounting.countBits(20478766));
		assertEquals(9, BitCounting.countBits(103021)); 
		assertEquals(6, BitCounting.countBits(287)); 
		assertEquals(15, BitCounting.countBits(115370965)); 
		assertEquals(5, BitCounting.countBits(31)); 
		assertEquals(7, BitCounting.countBits(417862)); 
		assertEquals(12, BitCounting.countBits(626031)); 
		assertEquals(4, BitCounting.countBits(89)); 
		assertEquals(10, BitCounting.countBits(674259)); 
	}

}
