package com.programs;

import java.util.Scanner;

public class Sum_Count 
{
	public void add()
	{
		System.out.println("\t addition");
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the number 1 : ");
		int a = s.nextInt();
		System.out.print("Enter the number 2 : ");
		int b = s.nextInt();
		int c = a+b;
		System.out.print("The value of c is "+c);
	}
	public void sumofnum()
	{
		System.out.print("\n \n \t Sum of the given number");
		int i=0,j=0;
		Scanner s = new Scanner(System.in);
		System.out.print("\n Enter the number : ");
		int a = s.nextInt();
		int b=a;
		while(b>0)
		{
			i=b%10;
			j=j+i;
			b=b/10;
		}
		System.out.print("\n The value is "+j);
	}
	public void count()
	{
		System.out.print("\n \n \t Program to find the count");
		Scanner s = new Scanner(System.in);
		System.out.print("\n Enter the number : ");
		int a = s.nextInt();
		int b=a, c=0;
		while(b>0)
		{
			b=b/10;
			c++;
		}
		System.out.println(" The count is " +c);
	}
	public static void main(String[] args) 
	{
		Sum_Count s = new Sum_Count();
		s.add();
		s.sumofnum();
		s.count();
	}
}
