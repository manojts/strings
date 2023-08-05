package com.strings;

import java.util.HashSet;
import java.util.Set;

public class MainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		int result = getLongestSubstringWithoutRepeatingCharacters(s);
		System.out.println("Length of longest substring without repetition in "+ s + " is " +result);

	}
	public static int getLongestSubstringWithoutRepeatingCharacters(String s) {
		Set<Character> set = new HashSet<Character>();
		int left = 0;
		int right = 0;
		int result = 0;
		int length = 0;
		while(right < s.length()) {
			while(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			length = right - left + 1;
			right++;
			if(length > result) {
				result = length;
			}
		}
		if(length > result) {
			result = length;
		}
		return result;
	}

}
