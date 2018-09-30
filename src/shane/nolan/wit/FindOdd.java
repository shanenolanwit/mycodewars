package shane.nolan.wit;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Given an array, find the int that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 * 
 * @author Shane Nolan
 * @link https://www.codewars.com/kata/54da5a58ea159efa38000836
 *
 */
public class FindOdd {
	
	public static int findIt(int[] a) {
		
		return Arrays.stream(a)
			.boxed()
			.filter(i -> Collections.frequency(Arrays.stream(a).boxed().collect(Collectors.toList()), i) % 2 > 0)
			.collect(Collectors.toList())
			.get(0);
	  }

}
