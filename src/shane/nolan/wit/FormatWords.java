package shane.nolan.wit;

import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Complete the method so that it formats the words into a single comma separated value. 
 * The last word should be separated by the word 'and' instead of a comma. 
 * The method takes in an array of strings and returns a single formatted string. 
 * Empty string values should be ignored. 
 * Empty arrays or null/nil values being passed into the method should result in an empty string being returned.
 * 
 * @author Shane Nolan
 * @link https://www.codewars.com/kata/format-words-into-a-sentence
 *
 */
public class FormatWords {
	
	public static String formatWords(String[] words) {
		   return words == null ? "" : Stream.of(words)
						                        .filter(word -> word.length() > 0)
						                        .collect(Collectors.joining(", "))
						                        .replaceAll(",([^,]+)$", " and$1");
		  }

}
