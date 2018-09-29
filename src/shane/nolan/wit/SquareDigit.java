package shane.nolan.wit;

import java.lang.Math; 
import java.util.stream.Collectors;
import java.util.Arrays;

/**
 * Welcome. In this kata, you are asked to square every digit of a number.
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 * 
 * @author Shane Nolan
 * @link https://www.codewars.com/kata/square-every-digit
 *
 */
public class SquareDigit {

  public int squareDigits(int n) {
     return Integer.parseInt(
               Arrays.stream(String.valueOf(n).split(""))
                 .map(ele -> String.valueOf(new Double(Math.pow(Integer.parseInt(ele),2)).intValue()))
                 .collect( Collectors.joining( "" ) )
            );
     
  }

}