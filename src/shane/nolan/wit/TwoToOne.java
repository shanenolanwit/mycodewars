package shane.nolan.wit;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Take 2 strings s1 and s2 including only letters from ato z. 
 * Return a new sorted string, the longest possible, containing distinct letters, 
 * each taken only once - coming from s1 or s2
 * @author Shane Nolan
 * @link https://www.codewars.com/kata/two-to-one
 *
 */
public class TwoToOne {

	public static String longest (String s1, String s2) {
		return Stream.of((s1+s2).split(""))
				.sorted()
				.distinct()
				.collect(Collectors.joining());	
	}

}