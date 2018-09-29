package shane.nolan.wit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * For building the encrypted string:
 * Take every 2nd char from the string, then the other chars, that are not every 2nd char, 
 * and concat them as new String.
 * Do this n times!
 * 
 * Examples:
 * "This is a test!", 1 -> "hsi  etTi sats!"
 * "This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
 * 
 * Write two methods:
 * String encrypt(final String text, final int n)
 * String decrypt(final String encryptedText, final int n)
 * For both methods:
 * If the input-string is null or empty return exactly this value!
 * If n is <= 0 then return the input text.
 * 
 * @author Shane Nolan
 * @link https://www.codewars.com/kata/57814d79a56c88e3e0000786
 *
 */
public class AlternatingSplit {

	public static String encrypt(final String text, final int n) {
		return ( n <= 0 ) ? text : encrypt(IntStream
				.range(0, text.length())
				.boxed()
				.collect(Collectors.groupingBy(i -> i%2 == 0))
				.values()
				.stream()
				.collect(ArrayList::new, List::addAll, List::addAll)
				.stream()
				.map(i -> String.valueOf(text.charAt((int)i)))
				.collect(Collectors.joining())
				,n-1
				); 
	}

	public static String decrypt(final String encryptedText, final int n) {
		return ( n <= 0 ) ? encryptedText : decrypt( 
				new StringBuilder()
				.append(IntStream
						.range(0, encryptedText.length()/2)
						.boxed()
						.map(i -> String.valueOf(encryptedText.charAt(i+encryptedText.length()/2)) + String.valueOf(encryptedText.charAt(i)))
						.collect(Collectors.joining()))
				.append(encryptedText.length() % 2 == 0 ? "" : encryptedText.charAt(encryptedText.length()-1))
				.toString(), n-1);

	}

}
