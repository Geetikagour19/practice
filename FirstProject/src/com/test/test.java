package com.test;

import java.util.*;

//polygon 
public class test {

 public static void main(String [] args){
	 int a,b,c,d;
	 int sq=0, rec=0,po=0;
	 	 Scanner sc = new Scanner(System.in);
	 	 while(sc.hasNextInt()){
	 		 a=sc.nextInt();
	 		 b=sc.nextInt();
	 		 c=sc.nextInt();
	 		 d=sc.nextInt();
	 		 
	 		 if(a<=0 || b<=0|| c<=0|| d<=0)
	 			 po++;
	 		 else if(a==b && b==c && c==d)
	 			 sq++;
	 		 else if(a==c && b==d)
	 			 rec++;
	 		 else
	 			 po++;
	 	 }
	 System.out.println(sq+" "+rec+" "+po);
 }
	 
 }
