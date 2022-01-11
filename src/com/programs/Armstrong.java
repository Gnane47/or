package com.programs;

import java.util.Scanner;

public class Armstrong 
{
	public void strong()
	{
		int i,j=0,b;
		System.out.println("\t Armstrong number");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int a =s.nextInt();
		b=a;
	
		while(b>0)
		{
			i=b%10;
			j=j+(i*i*i);
			b=b/10;
		}
		System.out.println("value is " +j);
		if(a==j)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not an armstrong number");
		}
	}
	
	public void countcheck()
	{
		int count = 0;
		for(int n=1;n<1000;n++)
		{
			int a,i,j=0;
			a=n;
			while(a>0)
			{
				i=a%10;
				j=j+(i*i*i);
				a=a/10;
			}
			if(j==n)
			{
			System.out.println("value is " +j);
			count++;
			}
		}
		System.out.println("count is " +count);
	}
	public static void main(String[] args) 
	{
		Armstrong a = new Armstrong();
		a.strong();
		a.countcheck();
	}
}
