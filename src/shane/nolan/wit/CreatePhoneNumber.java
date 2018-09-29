package shane.nolan.wit;

/**
 * Write a function that accepts an array of 10 integers (between 0 and 9), 
 * that returns a string of those numbers in the form of a phone number.
 * (123) 456-7890
 * The returned format must be correct in order to complete this challenge.
 * Don't forget the space after the closing parentheses!
 * 
 * @author Shane Nolan
 * @link https://www.codewars.com/kata/create-phone-number
 * 
 */
public class CreatePhoneNumber {
	
	public static String createPhoneNumber(int[] n) {
		return String.format("(%d%d%d) %d%d%d-%d%d%d%d", 
				n[0], n[1], n[2], n[3], n[4], n[5], n[6], n[7], n[8], n[9]);

	}
}
