package com.javastuff.removedupsdemo;

import java.util.Arrays;
import junit.framework.TestCase;
 

public class RemoveDuplicatesTest extends TestCase {

	// No Duplicates {1,2,3} -> {1,2,3}
	public void testNoDups() {
		int[] input = new int[] {1,2,3};
		int[] output = new int[input.length]  ;
		output = RemoveDuplicates.removeDups(input);
		assertTrue(Arrays.equals(input,output));
	}
	
	// Arrays with 0 values {0,0,1,0} -> {0,1}
	public void testZeros() {
		int[] input = new int[] {0,0,1,0};
		int[] expected = new int[] {0,1};
		int[] actual = RemoveDuplicates.removeDups(input);
		assertTrue(Arrays.equals(expected, actual));
	}
	
	// Simple duplicates
	public void testDups() {
		int[] input = new int[] {1,2,3,1,2,3};
		int[] expected = new int[] {1,2,3};
		int[] actual = RemoveDuplicates.removeDups(input);
		assertTrue(Arrays.equals(expected, actual));
	}
	
	// Complex duplicates test
	public void testComplex() {
		int[] input = new int[] {1,1,1,2,1,2,2,1,1,2};
		int[] expected = new int[] {1,2};
		int[] actual = RemoveDuplicates.removeDups(input);
		assertTrue(Arrays.equals(expected, actual));
	}
	
	// Nothing but duplicates
	public void testAllDups() {
		int[] input = new int[] {4,4,4,4,4,4};
		int[] expected = new int[] {4};
		int[] actual = RemoveDuplicates.removeDups(input);
		assertTrue(Arrays.equals(expected, actual));
	}
	
	// Null array test
	public void testNullArray() {
		int[] input = new int[] {};
		int[] expected = new int[] {};
		int[] actual = RemoveDuplicates.removeDups(input);
		assertTrue(Arrays.equals(expected, actual));
	}
	
	// Test Negative Integers
	public void testNegatives() {
		int[] input = new int[] {-4,4,-4,-3,3,-3,-1};
		int[] expected = new int[] {-4,4,-3,3,-1};
		int[] actual = RemoveDuplicates.removeDups(input);
		assertTrue(Arrays.equals(expected, actual));
		
	}
}
