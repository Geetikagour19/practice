package com.test;
import java.lang.*;
import java.util.*;
public class BalancedBracket {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			
			if((str.length() & 1)==1) System.out.println("false");
			else{
				char [] c=str.toCharArray();
				Stack<Character> s=new Stack<Character>();
				for(char b : c){
				switch(b){
				case '{' : s.push('}'); break;
				case '[' : s.push(']'); break;
				case '(' : s.push(')'); break;
				default : 
					if(s.empty() || b!=s.peek())
						System.out.println("false");
					s.pop();
				
				}
				
			}
				if(s.empty())
				System.out.println("true");	
				else
					System.out.println("false");
		}	
	}
		
		
}
}
