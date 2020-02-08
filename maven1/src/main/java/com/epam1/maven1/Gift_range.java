package com.epam1.maven1;
import items_in_a_gift.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Gift_range {

	public Gift_range() {
		// TODO Auto-generated constructor stub
	}
	
	public void printSweets(ArrayList<Sweets> sweet)
	{
		for(Sweets s:sweet)
		{
			System.out.println(s.toString());
		}
	}
	public void printChocolates(ArrayList<Chocolates> choco)
	{
		for(Chocolates c:choco)
		{
			System.out.println(c.toString());
		}
	}
	public void printCandies(ArrayList<Candies> candy)
	{
		for(Candies k:candy)
		{
			System.out.println(k.toString());
		}
	}
	public static void Cal_Range_of_Candies(ArrayList<Candies> candy,int type)
	{
		Scanner sc=new Scanner(System.in);
		if(type==1)
		{
			int lower_cost;
			int higher_cost;
			int j=0;
			System.out.println("enter the upper and lower bounds of the cost:");
			lower_cost=sc.nextInt();
			higher_cost=sc.nextInt();
			for(Candies c : candy)
			{
				if(c.getCost()>=lower_cost && c.getCost()<=higher_cost)
				{
					System.out.println(c.toString());
					j++;
				}
			}
			if(j==0)
			 System.out.println("there are no candies in the range of cost given");
		}
		else
		{
			int lower_weight;
			int higher_weight;
			int j=0;
			System.out.println("enter the upper and lower bounds of the weight:");
			lower_weight=sc.nextInt();
			higher_weight=sc.nextInt();
			for(Candies c : candy)
			{
				if(c.getWeight()>=lower_weight && c.getWeight()<=higher_weight)
				{
					System.out.println(c.toString());
					j++;
				}
			}
			if(j==0)
			 System.out.println("there are no candies in the range of weight given");
		}
	}
}
