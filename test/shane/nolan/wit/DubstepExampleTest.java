package shane.nolan.wit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DubstepExampleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Test1() {
		assertEquals("ABC", Dubstep.SongDecoder("WUBWUBABCWUB"));
		assertEquals("R L", Dubstep.SongDecoder("RWUBWUBWUBLWUB"));
	}
	

}
