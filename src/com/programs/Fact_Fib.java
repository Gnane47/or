package com.programs;

import java.util.Scanner;

public class Fact_Fib 
{
	public void fact()
	{
		long fact=1;
		System.out.println("\t Factorial of a number");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value : ");
		long a = s.nextInt();
		for(int i=1; i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of the number is "+fact);
	}
	public void fib()
	{
		int b1=0, b2 = 1, b3;
		System.out.println("\t Fibonacci series");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int a = s.nextInt();
		System.out.print(b1 +" " +b2);
		for(int i=2; i<=a;i++)
		{
			b3=b1+b2;
			System.out.print(" " +b3);
			b1=b2;
			b2=b3;
		}
//		while(i<=a)
//		{
//			b3=b1+b2;
//			System.out.print(" " +b3);
//			b1=b2;
//			b2=b3;
//			i++;
//		}
	}
	public static void main(String[] args) 
	{
		Fact_Fib ff = new Fact_Fib();
		ff.fact();
		ff.fib();
	}
}
