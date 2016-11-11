package com.test;
import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
public class anagram2 {

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<String>();
		while(sc.hasNext()){
			arr.add(sc.nextLine());
		}
		
		Map<String, ArrayList<String>> hm= new HashMap<String, ArrayList<String>>();
		for(int i=0;i<arr.size();i++){
			char [] A=arr.get(i).toCharArray();
			Arrays.sort(A);
			String str1=new String(A);
			String str=str1.trim();
			if(hm.containsKey(str)==true){
				ArrayList<String> temp=hm.get(str);
				temp.add(arr.get(i));
			}
			else{
				ArrayList<String> temp=new ArrayList<String>();
				temp.add(arr.get(i));
				hm.put(str, temp);
			}
			
		}
		for(Map.Entry<String, ArrayList<String>> entry : hm.entrySet()){
			ArrayList<String> temp=entry.getValue();
			for(int k=0;k<temp.size();++k){
				System.out.print(temp.get(k) + " ");
			}
			System.out.println(" ");
		}
	}
}
