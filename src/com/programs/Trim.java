package com.programs;

public class Trim 
{
	public static void main(String[] args) 
	{
		String s = "Running and Debugging";
		String s1 = s.trim().replace(" ", "");
		System.out.println("removed space" +s1);
		String s2=s.replaceAll("[AaEeIiOoUu]","*");
		System.out.println("replaced string : " +s2);
	}
}
