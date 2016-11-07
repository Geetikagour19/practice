package com.test;

import java.util.Arrays;

public class anagram {
	
	boolean isAnagram(String a, String b){
		char [] A = a.toCharArray();
		char [] B = b.toCharArray();
		Arrays.sort(A);
		Arrays.sort(B);
		return Arrays.equals(A, B);
	}

	public static void main(String args[]){
		anagram ag = new anagram();
		boolean ret =ag.isAnagram("anagram", "marganaa");
		System.out.println((ret)?"Anagram" : "Not Anagram");
	}
}
