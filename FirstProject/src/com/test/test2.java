package com.test;
import java.util.*;
//Delta Encoding
public class test2 {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int prev=sc.nextInt();
		System.out.print(prev+" ");
		while(sc.hasNextInt()){
		int curr=sc.nextInt();
		int diff = prev-curr;
			if(Math.abs(diff)>127)
				System.out.print("-128" +" ");
			System.out.print(curr-prev + " ");
			prev=curr;
		}
		
	}
}

