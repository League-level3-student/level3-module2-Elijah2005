package _01_Searching_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.
		String[] test = { "a", "b", "c", "d" };
		assertEquals(1, _00_LinearSearch.linearSearch(test, "b"));
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		int[] test = {0,1,2,3,4};
		assertEquals(1, _01_BinarySearch.binarySearch(test, 0, test.length -1, 1));
		assertEquals(-1,_01_BinarySearch.binarySearch(test, 0, test.length -1, 5) );
		assertEquals(4,_01_BinarySearch.binarySearch(test, 0, test.length -1, 4));
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		int[] test = {0,1,2,3,4};
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(test, 2));
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		int[] test = {0,1,2,3,4};
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(test, 3));
	}
}
