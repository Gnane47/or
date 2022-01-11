package com.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Vowels 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String a = s.nextLine();
		int v=0;
		int nv=0;
		Map <Character,Integer> vmap = new LinkedHashMap <Character,Integer> ();
		Map <Character,Integer> nvmap = new LinkedHashMap <Character,Integer> ();
		for(int i=0;i<a.length();i++)
		{
			char c = a.charAt(i);
			if(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i'|| c=='O' || c=='o' ||
			   c=='U' || c=='u')
			{
				if(vmap.get(c)==null)
				{
					vmap.put(c,1);
				}
				else
				{
					Integer j = vmap.get(c);
					vmap.put(c,j+1);
				}
				v++;
			}
			else
			{
				if(nvmap.get(c)==null)
				{
					nvmap.put(c,1);
				}
				else
				{
					Integer j = nvmap.get(c);
					nvmap.put(c,j+1);
				}
				nv++;
			}
		}
		System.out.println("vowels and its count");
		Set<Entry<Character,Integer>> entryset1 = vmap.entrySet();
		for(Entry<Character,Integer> entry : entryset1)
		{
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " = " +value);
		}
		System.out.println("non vowels and its count");
		Set<Entry<Character,Integer>> entryset2 = nvmap.entrySet();
		for(Entry<Character,Integer> entry : entryset2)
		{
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " = " +value);
		}
		System.out.println("vowels count = " +v);
		System.out.println("non vowels count = " +nv);
	}
}
