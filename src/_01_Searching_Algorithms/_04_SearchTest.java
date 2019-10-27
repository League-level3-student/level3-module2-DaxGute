package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] unsorted = {"3", "2", "9", "3", "1", "0"};
		assertEquals(0, _00_LinearSearch.linearSearch(unsorted, "3"));
		assertEquals(1, _00_LinearSearch.linearSearch(unsorted, "2"));
		assertEquals(-1, _00_LinearSearch.linearSearch(unsorted, "10"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] sorted = {0, 1, 2, 2, 3, 4};
		assertEquals(0, _01_BinarySearch.binarySearch(sorted, 0, 4, 0));
		assertEquals(1, _01_BinarySearch.binarySearch(sorted, 0, 4, 1));
		assertEquals(-1, _01_BinarySearch.binarySearch(sorted, 0, 4, 5));
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] sorted = {0, 1, 2, 2, 3, 4};
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(sorted, 0));
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(sorted, 1));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(sorted, 5));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] sorted = {0, 1, 2, 2, 3, 4};
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(sorted, 0));
		assertEquals(1, _03_ExponentialSearch.exponentialSearch(sorted, 1));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(sorted, 5));
	}
}
