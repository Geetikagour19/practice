package com.test;
import java.util.*;
public class Squareroot {
	public static void main(String [] args){
		int[] a = { 3, 1, 4, 5, 19, 6 };
		int[] b = { 14, 9, 22, 36, 8, 0, 64, 25 };
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<a.length;++i){
			s.add(a[i]*a[i]);
		}
		for(int j=0;j<b.length;++j){
			if(s.contains(b[j]))
				System.out.println(b[j]);
		}
	}
}
