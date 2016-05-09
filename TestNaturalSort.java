import java.util.Arrays;

import org.junit.Test;

/**
 * 
 */

/**
 * @author rc250247
 *
 */
public class TestNaturalSort {

	
	public static void sortInts(){
		
		final int[] numbers = {-3, -5, 1, 7, 4, -2};
		final int[] expected = {-5, -3, -2, 1, 4, 7};
		
		
		Arrays.sort(numbers);

		for (int i : expected) {
			System.out.print(i);
		}
		System.out.println();
		for (int i : numbers) {
			System.out.print(i);
		}
		
	}
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		sortInts();
		
		

	}

}
