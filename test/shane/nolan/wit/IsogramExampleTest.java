package shane.nolan.wit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IsogramExampleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(Isogram.isIsogram("Dermatoglyphics"), true);
        assertEquals(Isogram.isIsogram("isogram") , true);
        assertEquals(Isogram.isIsogram("moose") , false);
        assertEquals(Isogram.isIsogram("isIsogram") , false);
        assertEquals(Isogram.isIsogram("aba") , false);
        assertEquals(Isogram.isIsogram("moOse") , false);
        assertEquals(Isogram.isIsogram("thumbscrewjapingly") , true);
        assertEquals(Isogram.isIsogram("") , true); 
	}

}
