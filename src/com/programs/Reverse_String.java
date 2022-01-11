package com.programs;

public class Reverse_String 
{
	public void reverseword()
	{
		StringBuffer sb = new StringBuffer("Welcome");
//		StringBuffer reverse = sb.reverse();
//		System.out.println(reverse);
		String reverse = "";
		for(int i=sb.length()-1;i>=0;i--)
		{
			reverse = reverse + sb.charAt(i);
		}
		System.out.println("The reversed string is "+reverse);
	}
	public void eachword()
	{
		String s = new String ("i am gnane");
		String[] sp = s.split(" ");
		String revstring = "";
		for(String a : sp)
		{
			String revword = "";
			for(int i=a.length()-1; i>=0; i--)
			{
				revword = revword + a.charAt(i);
			}
			revstring = revstring + revword + " ";
			
		}
		System.out.println("orginal string is -- " +s);
		System.out.println("reversal string is -- " +revstring);
	}
	public static void main(String[] args) 
	{
		Reverse_String r = new Reverse_String();
		r.reverseword();
		r.eachword();
	}
}
