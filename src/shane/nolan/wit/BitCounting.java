package shane.nolan.wit;

/**
 * Write a function that takes an (unsigned) integer as input, 
 * and returns the number of bits that are equal to one in the binary representation of that number.
 * 
 * @author Shane Nolan
 * @link https://www.codewars.com/kata/526571aae218b8ee490006f4
 *
 */
public class BitCounting {

	public static int countBits(int n){
		return Integer.toBinaryString(n)
				.replace("0", "")
				.length();
	}
	
}