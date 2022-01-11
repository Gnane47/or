package com.programs;

import java.util.Scanner;

public class Swapping 
{
	public void swap()
	{
		Scanner s = new Scanner (System.in);
		System.out.println("\t Swapping values ");
		System.out.print("Enter the first number : ");
		int a = s.nextInt();
		System.out.print("Enter the second number : ");
		int b = s.nextInt();
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
	}
	public void swap1()
	{
		Scanner s = new Scanner (System.in);
		System.out.print("enter the first number : ");
		int a = s.nextInt();
		System.out.print("enter the second number : ");
		int b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		Swapping s = new Swapping();
		s.swap();
		s.swap1();
	}
}
