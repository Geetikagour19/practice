package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class anagram {
	
	static void findAnagram(ArrayList<String> arr){
		Map<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
		
		for(int i=0;i<arr.size();++i){
			char [] A = arr.get(i).toCharArray();
			Arrays.sort(A);
			String str1 = new String(A);
			String str=str1.trim();
			if (hm.containsKey(str) == true)
			{
				ArrayList<String> temp = hm.get(str);
				temp.add(arr.get(i));
				//hm.put(str, temp);
			}
			else
			{
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(arr.get(i));
				hm.put(str, temp);
			}
		}
		

		for (Map.Entry<String, ArrayList<String>> entry : hm.entrySet()) 
		{
			ArrayList<String> temp = entry.getValue();
			for (int i = 0; i < temp.size(); ++i)
			{
				System.out.print(temp.get(i) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		
		//boolean ret =ag.isAnagram("anagram", "marganaa");
		//System.out.println((ret)?"Anagram" : "Not Anagram");
		
		Scanner sc = new Scanner(System.in);
	
		ArrayList<String> arr = new ArrayList<String>();
		while (sc.hasNext())
		{

			arr.add(sc.nextLine());
		}
		findAnagram(arr);
		
	}
}
