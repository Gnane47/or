package com.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Word_Char_Count 
{
	public void wordcount()
	{
		String s = "Count and word programs and";
		String [] split= s.split(" ");
		Map <String,Integer> m = new LinkedHashMap();
		for(String str :split)
		{
			if(m.containsKey(str))
			{
				Integer count = m.get(str);
				count++;
				m.put(str, count+1);
			}
			else
			{
				m.put(str, 1);
			}
		}
		System.out.println(m);
		Set<Entry<String,Integer>> e = m.entrySet();
		for(Entry <String,Integer> entry :e)
		{
			System.out.println(entry);
		}
	}
	public void charcount()
	{
		String s = "If you are working alone, wear a mask";
		Map <Character,Integer> m = new LinkedHashMap();
		for(int i=0; i<s.length();i++)
		{
			char c = s.charAt(i);
			if(m.containsKey(c))
			{
				Integer c1 = m.get(c);
				c1++;
				m.put(c, c1);
			}
			else
			{
				m.put(c, 1);
			}
		}
		System.out.println(m);
		Set<Entry<Character,Integer>> e = m.entrySet();
		for(Entry<Character,Integer> entry :e)
		{
			System.out.println(entry);
		}
	}
	public static void main(String[] args) 
	{
		Word_Char_Count w = new Word_Char_Count();
		w.wordcount();
		w.charcount();
	}
}