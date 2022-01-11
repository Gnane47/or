package com.programs;

import java.util.Scanner;

public class Palindrome 
{
	public void reverse() 
	{
		int i=0, j=0, b;
		Scanner s= new Scanner (System.in);
		System.out.print("Enter the number to reverse : ");
		int a = s.nextInt();
		b=a;
		while(b>0)
		{
			i=b%10;
			j=(j*10)+i;
			b=b/10;
		}
		System.out.println("The reversed value is "+j);
		if(a==j)
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("The given number is not a palindrome");
		}
	}
	public void count()
	{
		int c=0;
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the value to print upto :");
		int n = s.nextInt();
		for(int b=1;b<n;b++)
		{
			int i=0,j=0,a;
			a=b;
			while(a>0)
			{
				i=a % 10;
				j=(j*10)+i;
				a=a/10;
			}
			if(b==j)
			{
				System.out.print(j + ",");
				c++;
			}
		}
		System.out.println("\n The count is " +c);
	}
	public static void main(String[] args) 
	{
		System.out.println("\t Palindrome");
		Palindrome p =new Palindrome();
		p.reverse();
		p.count();
	}
}
