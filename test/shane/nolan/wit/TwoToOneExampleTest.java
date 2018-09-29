package shane.nolan.wit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoToOneExampleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
		assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
		assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
		assertEquals("adefghklmnorstu", TwoToOne.longest("lordsofthefallen", "gamekult"));
		assertEquals("acdeorsw", TwoToOne.longest("codewars", "codewars"));
		assertEquals("acdefghilmnorstuw", TwoToOne.longest("agenerationmustconfrontthelooming", "codewarrs"));
	}

}
