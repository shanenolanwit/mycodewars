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
	}

}
