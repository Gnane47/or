package com.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Repetition 
{
		public static void main(String[] args) 
		{
			System.out.println("\t repetition program");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the string : ");
			String s = sc.nextLine();
//			String s = "of the people by the people for the people";
			String[] split = s.split(" ");
			Map<String,Integer> map =new HashMap();
			for(String str : split)
			{
				if(map.containsKey(str))
				{
					Integer i = map.get(str);
					map.put(str, i+1);	
				}
				else
				{
					map.put(str, 1);
				}
			}
			System.out.println(map);
			Set<Entry<String, Integer>> e = map.entrySet(); 
			for(Entry<String,Integer> entry :e)
			{
				if(entry.getValue()>1)
				{
					System.out.println(entry);
				}
			}	
		}
}
