package shane.nolan.wit;
/**
 * A digital root is the recursive sum of all the digits in a number. 
 * Given n, take the sum of the digits of n. 
 * If that value has two digits, continue reducing in this way until a single-digit number is produced. 
 * This is only applicable to the natural numbers.
 * 
 * @author Shane Nolan
 * @link https://www.codewars.com/kata/541c8630095125aba6000c00
 *
 */

public class DRoot {
	
	  public static int digital_root(int n) {
	    return n <= 9 ? n : digital_root(String.valueOf(n).chars().map(c -> Character.getNumericValue(c)).sum());
	  }
}
