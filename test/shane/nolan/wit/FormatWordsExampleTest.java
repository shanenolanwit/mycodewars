package shane.nolan.wit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FormatWordsExampleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("one", FormatWords.formatWords(new String[] {"one"}));
        assertEquals("one and three", FormatWords.formatWords(new String[] {"one", "", "three"}));
        assertEquals("three", FormatWords.formatWords(new String[] {"", "", "three"}));
        assertEquals("one and two", FormatWords.formatWords(new String[] {"one", "two", ""}));
        assertEquals("", FormatWords.formatWords(new String[] {}));
        assertEquals("", FormatWords.formatWords(null));
        assertEquals("", FormatWords.formatWords(new String[] {""}));
	}

}
