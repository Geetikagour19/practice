package com.test;

public class test {

	void findShap(int a, int b, int c, int d){
		if(a==b && b==c && c==d){
			System.out.println("Square");
		}else if(a==c && b==d){
			System.out.println("Ractangle");
		}else{
			System.out.println("Others");
		}
	}
	
	public static void main(String args[]){
		test t= new test();
		t.findShap(120,20,201,20);
	}
}
