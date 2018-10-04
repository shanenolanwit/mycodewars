package shane.nolan.wit;

import java.util.Arrays;

/**
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive. 
 * Implement a function that determines whether a string that contains only letters is an isogram. 
 * Assume the empty string is an isogram. Ignore letter case.
 * 
 * @author Shane Nolan
 * @link https://www.codewars.com/kata/isograms
 *
 */
public class Isogram {

	public static boolean  isIsogram(String str) {
		return Arrays.stream(str.toLowerCase().split(""))
				.filter(s -> s.trim().length() > 0)
				.distinct()
				.count() == str.length();
	} 

}
