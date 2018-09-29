package shane.nolan.wit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlternatingSplitExampleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	 @Test
	  public void encryptExampleTests() {
	    assertEquals("This is a test!", AlternatingSplit.encrypt("This is a test!", 0));
	    assertEquals("hsi  etTi sats!", AlternatingSplit.encrypt("This is a test!", 1));
	    assertEquals("s eT ashi tist!", AlternatingSplit.encrypt("This is a test!", 2));
	    assertEquals(" Tah itse sits!", AlternatingSplit.encrypt("This is a test!", 3));
	    assertEquals("This is a test!", AlternatingSplit.encrypt("This is a test!", 4));
	    assertEquals("This is a test!", AlternatingSplit.encrypt("This is a test!", -1));
	    assertEquals("hskt svr neetn!Ti aai eyitrsig", AlternatingSplit.encrypt("This kata is very interesting!", 1));
	  }
	    
	  @Test
	  public void decryptExampleTests() {
	    assertEquals("This is a test!", AlternatingSplit.decrypt("This is a test!", 0));
	    assertEquals("This is a test!", AlternatingSplit.decrypt("hsi  etTi sats!", 1));
	    assertEquals("This is a test!", AlternatingSplit.decrypt("s eT ashi tist!", 2));
	    assertEquals("This is a test!", AlternatingSplit.decrypt(" Tah itse sits!", 3));
	    assertEquals("This is a test!", AlternatingSplit.decrypt("This is a test!", 4));
	    assertEquals("This is a test!", AlternatingSplit.decrypt("This is a test!", -1));
	    assertEquals("This kata is very interesting!", AlternatingSplit.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
	  }
	    
	  @Test
	  public void nullOrEmpty() {
	    assertEquals("", AlternatingSplit.encrypt("", 0));
	    assertEquals("", AlternatingSplit.decrypt("", 0));
	    assertEquals(null, AlternatingSplit.encrypt(null, 0));
	    assertEquals(null, AlternatingSplit.decrypt(null, 0));
	  }
	  

}
