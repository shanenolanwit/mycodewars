package shane.nolan.wit;

/**
 * Usually when you buy something, you're asked whether your credit card number, 
 * phone number or answer to your most secret question is still correct. 
 * However, since someone could look over your shoulder, you don't want that shown on your screen. 
 * Instead, we mask it.
 * Your task is to write a function maskify, which changes all but the last four characters into '#'.
 * 
 * @author Shane Nolan
 * @link https://www.codewars.com/kata/credit-card-mask
 *
 */

public class Maskify {
	
    public static String maskify(String str) {
        return str.length() <= 4 ? str : new StringBuilder()
       			                              .append(str.split(".{1,4}$")[0].replaceAll(".", "#"))
       			                              .append(str.replace(str.split(".{1,4}$")[0], ""))
       			                              .toString();
    }
}
