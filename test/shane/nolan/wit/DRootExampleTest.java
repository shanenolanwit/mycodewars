package shane.nolan.wit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DRootExampleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals( "Nope!" , 7, DRoot.digital_root(16));
		assertEquals( "Nope!" , 6, DRoot.digital_root(456));
		assertEquals( "Nope!" , 7, DRoot.digital_root(16));
		assertEquals( "Nope!" , 6, DRoot.digital_root(195));
		assertEquals( "Nope!" , 2, DRoot.digital_root(992));
		assertEquals( "Nope!" , 9, DRoot.digital_root(99999999));
		assertEquals( "Nope!" , 9, DRoot.digital_root(167346));
		assertEquals( "Nope! Should work for 0" , 0, DRoot.digital_root(0));
	}

}
