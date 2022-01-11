package com.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class String_Functions 
{
	public void count()
	{
		String s = new String ("I am Gnaneswar N.S, 04");
		System.out.println("The given string is : " +s);
		int small=0; int num=0; int caps=0; int specialchar=0;
		for(int i=0; i<s.length();i++)
		{
			if('a'<= s.charAt(i) && s.charAt(i)<= 'z')
			{
				small++;
			}
			else if ('0' <=s.charAt(i) && s.charAt(i)<='9')
			{
				num++;
			}
			else if ('A'<=s.charAt(i) && s.charAt(i)<='Z')
			{
				caps++;
			}
			else 
			{
				specialchar++;
			}
		}
		System.out.println("no of smallcase : " +small);
		System.out.println("no of numbers : " +num);
		System.out.println("no of caps : " +caps);
		System.out.println("no of special char : " +specialchar);
	}
//	public void Upper_Lower_case()
//	{
//		String s = new String ("upper and lower case");
//		String capitalize = wordUtils.capitalize(s);
//		String uncapitalize = wordUtils.uncapitalize(s);
//		System.out.println("upper case : " +capitalize);
//		System.out.println("lower case : " +uncapitalize);	
//	}
	public void caps()
	{
		String s = "welcome to java";
		String[] a = s.split("");
		StringBuilder sd = new StringBuilder();
		for(int i=0;i<a.length;i++)
		{
			char c = a[i].charAt(0);
			char Caps = Character.toUpperCase(c);
			String substring = a[i].substring(1);
			sd.append(Caps).append(substring).append("");
		}
		String t = sd.toString().trim();
		System.out.println("converted string is " +t);
	}
//	public void swapcase()
//	{
//		String s = "Gnaneswar";
//		String swap = StringUtils.swapcase(s);
//		System.out.println("Before swap - " +s);
//		System.out.println("Swapped "+swap);
//	}
	public void replace()
	{
		String s = new String (" Directed   by   Nolan  ");
		String r = s.replace(" ","!");
		System.out.println("Replaced String is "+r);
	}
	public void duplicate()
	{
		String s[]= {"python", "java", "CS", "python", "hello", "hello"};
		List<String> l = Arrays.asList(s);
		Set <String> t = new TreeSet <String> (l);
		System.out.println("duplicates are " +t);
		for(int i=0; i<s.length;i++)
		{
			for (int j=i+1; j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					System.out.println("duplicates : " +s[j]);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		String_Functions func = new String_Functions();
		func.count();
//		func.Upper_Lower_case();
		func.caps();
//		func.swapcase();
		func.replace();
		func.duplicate();
	}
}
