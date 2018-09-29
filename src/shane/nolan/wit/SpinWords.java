package shane.nolan.wit;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a function that takes in a string of one or more words, 
 * and returns the same string, but with all five or more letter words reversed. 
 * Strings passed in will consist of only letters and spaces. 
 * Spaces will be included only when more than one word is present.
 * 
 * @author Shane Nolan
 * @link https://www.codewars.com/kata/5264d2b162488dc400000001
 *
 */
public class SpinWords {

	public String spinWords(String sentence) {
		return Stream.of(sentence.split(" "))
				.map(w -> (w.length() < 5) ? w : new StringBuilder(w).reverse().toString())
				.collect(Collectors.joining(" "));
	}

}
