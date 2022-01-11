package com.programs;

import java.util.List;
import java.util.ArrayList;

public class Duplicates 
{
	public void dup()
	{
		List <Object> l1 = new ArrayList <Object> ();
		l1.add(10); l1.add(20); l1.add("abc"); 
		l1.add(10); l1.add(20);l1.add("abc"); l1.add(50.2);
		System.out.println("The List l1 is " +l1);
		List <Object> l2 = new ArrayList <Object> ();
		for(int i=0; i<l1.size(); i++)
		{
			for(int j=i+1; j<l1.size();j++)
			{
				if(l1.get(i)==l1.get(j))
				{
					if(l2.contains(l1.get(j)))
					{
						continue;
					}
					l2.add(l1.get(j));
				}
			}
		}
		System.out.println("Duplicates are " +l2);
		boolean equals = l1.equals(l2);
		if(equals==true)
		{
			System.out.println("lists are equal");
		}
		else
		{
			System.out.println("lists are not equal");
		}
	}
	public static void main(String[] args) 
	{
		Duplicates d = new Duplicates();
		d.dup();
	}
}
