package shane.nolan.wit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SpinWordsExampleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
		assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
		assertEquals("This is a test", new SpinWords().spinWords("This is a test"));
		assertEquals("This is rehtona test", new SpinWords().spinWords("This is another test"));
		assertEquals("You are tsomla to the last test", new SpinWords().spinWords("You are almost to the last test"));
		assertEquals("Just gniddik ereht is llits one more", new SpinWords().spinWords("Just kidding there is still one more"));
		assertEquals("ylsuoireS this is the last one", new SpinWords().spinWords("Seriously this is the last one"));
	}

}
