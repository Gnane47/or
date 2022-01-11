package com.august28;

import java.util.Scanner;

public class Loan_eligible 
{
	public static void main(String[] args) 
	{
		System.out.println("\t Loan eligiblity");
		System.out.println("------------------------------------------");
		Scanner s = new Scanner (System.in);
		System.out.println("1.Married"); System.out.println("2.Unmarried"); System.out.println("3.Temporary");
		System.out.print("\n Select the option : ");
		String a1=s.nextLine();
		switch(a1)
		{
		case "1":
			System.out.print("Do you have a permanent or temporary job :");
			String b1= s.nextLine();
			if(b1.equalsIgnoreCase("permanent"))
			{
				System.out.print("Do you have 30 years of service : ");
				String b2=s.nextLine();
				if(b2.equalsIgnoreCase("yes"))
				{
					System.out.println("Your eligible loan amount is Rs. 60,000");
				}
				else
				{
				System.out.println("Your eligible loan amount is Rs. 35,000");
				}
			}
			else
			{
				if(b1.equalsIgnoreCase("temporary"))
				{
					System.out.println("Your eligible loan amount is Rs. 10,000");
				}
			}
		break;
		case "2":
				System.out.print("Do you have a permanent or temporary job :");
				String b2= s.nextLine();
				if(b2.equalsIgnoreCase("permanent"))
				{
					System.out.print("Do you have 30 years of service : ");
					String b3=s.nextLine();
					if(b3.equalsIgnoreCase("yes"))
					{
						System.out.println("Your eligible loan amount is Rs. 50,000");
					}
					else
					{
					System.out.println("Your eligible loan amount is Rs. 25,000");
					}
				}
				else 
				{
					if(b2.equalsIgnoreCase("temporary"))
					{
						System.out.println("Your eligible loan amount is Rs. 10,000");
					}
				}
		break;
		case "3" :
				System.out.println("Do you have a temporary job : ");
				String b4 = s.nextLine();
				if(b4.equalsIgnoreCase("yes"))
				{
					System.out.println("Your eligible loan amount is Rs. 10,000");
				}
		break;
		default : 
			System.out.println("Please select the valid option, try again");
			break;
		}
	}
}