package com.programs;

import java.util.Scanner;

public class Triangle_Codes 
{
	public void starmark()
	{
		System.out.println("\t Stardown");
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the no of stars : ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void doublestar()
	{
		System.out.println("\t double");
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the no of stars : ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void starmarkdown()
	{
		System.out.println("\t stardown");
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the no of stars : ");
		int n = s.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void num()
	{
		System.out.println("\t number");
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the no of values : ");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			int num=1;
			for(int j=0;j<=i;j++)
			{
			System.out.print(num +" ");
			num++;
			}
			System.out.println();
		}
	}	
	public void revnum()
	{
		System.out.println("\t reverse number");
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the no of values : ");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			int num=1;
			for(int j=i+1;j<=n;j++)
			{
			System.out.print(num +" ");
			num++;
			}
			System.out.println();
		}
	}
	public void oddtri()
	{
		System.out.println("\n \t odd number triangle");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n = s.nextInt(); 
		int num=1;
		for(int i=1;i<=n;i=i+2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num +" ");
			}
			System.out.println();
			num+=2;
		}
	}
	public void eventri()
	{
		System.out.println("\t even number triangle");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n = s.nextInt(); 
		int num=0;
		for(int i=0;i<=n;i=i+2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num +" ");
			}
			System.out.println();
			num+=2;
		}
	}
	public void evenstarmark()
	{
		System.out.println("\t even star mark");
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the no of stars : ");
		int n = s.nextInt();
		for(int i=0;i<=n;i=i+2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void pyramid()
	{
		System.out.println("\n \t pyramid structure");
		int r=5;
		for(int i=r;i>=1;i--)
		{
			for(int j=1;j<i*2;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=r;j++)
			{
				System.out.print(j+ " ");
			}
			for(int j=r-1;j>=i;j--)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Triangle_Codes t = new Triangle_Codes();
//		t.starmark();
//		t.doublestar();
//		t.starmarkdown();
//		t.num();
//		t.revnum();
//    	t.oddtri();
		t.eventri();
		t.evenstarmark();
		t.pyramid();
	}
}

