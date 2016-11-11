package com.test;
import java.util.*;
public class CompressString {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res=" ";
		int ind =0;
		while(ind<s.length()){
			char curr=s.charAt(ind);
			int num=1;
			while(ind<s.length()-1 && curr==s.charAt(ind+1)){
				ind++;
				num++;
				
			}
			ind++;
			res +=String.format("%s%s", curr,num);
		}
		
		System.out.println(res);
	}
}
