package shane.nolan.wit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MaskifyExampleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("############5616", Maskify.maskify("4556364607935616"));
		assertEquals("#######5616",      Maskify.maskify(     "64607935616"));
		assertEquals("1",                Maskify.maskify(               "1"));
		assertEquals("",                 Maskify.maskify(                ""));

		// "What was the name of your first pet?"
		assertEquals("##ippy",                                    Maskify.maskify("Skippy")                                  );
		assertEquals("####################################man!",  Maskify.maskify("Nananananananananananananananana Batman!"));

	}

}
