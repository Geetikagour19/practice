package com.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
 
class pairSum
{
    private static final int MAX = 100000;
 
    static void printpairs(ArrayList<Integer> arr,int sum)
    {
       
        boolean[] binmap = new boolean[MAX];
 
        for (int i=0; i<arr.size(); ++i)
        {
            int temp = sum-arr.get(i);
 
            if (temp>=0 && binmap[temp])
            {
                System.out.println(1);
                return;
            }
            binmap[arr.get(i)] = true;
        }
        System.out.println(0);
    }
 
   
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Before loop");
        while (sc.hasNextInt())
        {
        	arr.add(sc.nextInt());
        }
        printpairs(arr,  N);
        System.out.println("After loop");
    }
}