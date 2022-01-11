package com.programs;

import java.util.Scanner;

public class Mul_Prime
{
	public void Mul()
	{
		System.out.println("\n \t Multiplication");
		Scanner s = new Scanner (System.in);
		System.out.print("which table to multiply : ");
		int a = s.nextInt();
		System.out.print("upto which value : ");
		int b = s.nextInt();
		int c;
		for(int i=1;i<=b;i++)
		{
			c=a*i;
			System.out.println(a + " * " + i+ " = " +c);
		}
	}
	public void prime()
	{
		int c=0;
		System.out.println("\n \t Prime Numbers");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value to start : ");
		int a = s.nextInt();
		System.out.print("Enter the value to stop : ");
		int b = s.nextInt();
		for(int i=a;i<=b;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(i+ " ");
				c++;
			}
		}
		System.out.print("\n count is " +c);
	}
	public void primecount()
	{
		
	}
	
	public static void main(String[] args) 
	{
		Mul_Prime mp = new Mul_Prime();
		mp.Mul();
		mp.prime();
		mp.primecount();
	}
}
