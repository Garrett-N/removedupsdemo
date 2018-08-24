package com.javastuff.removedupsdemo;

import java.util.ArrayList;

public class RemoveDuplicates {
	
	public static int[] removeDups (int[] s) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int x=0; x<s.length; x++) {
			if (x==0) { // Always add the first element
				result.add(s[0]); 
				continue;
			}
			
			if (!(ifExists(result, s[x]))) {
				result.add(s[x]);
			}
		}
		
		return arrayListToArray(result);
	}
	
	// Does the element exist in the arraylist
	public static boolean ifExists (ArrayList<Integer> array, int element) {
		for (int k=0; k<array.size() ; k++ ) {
			if (element == array.get(k)) return true;
		} 
		return false;
	}
	
	public static int[] arrayListToArray (ArrayList<Integer> arraylist ) {
		
		int[] array = new int[arraylist.size()] ;
		
		for (int x=0; x < arraylist.size(); x++) {
			array[x] = arraylist.get(x);
		}
		
		return array;
	}
}
