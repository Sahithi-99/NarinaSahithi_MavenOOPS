package com.epam1.maven1;
import items_in_a_gift.Sweets;
import items_in_a_gift.Chocolates;
import items_in_a_gift.Candies;
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
	public static void Cal_Range_of_Candies(ArrayList<Candies> candy,int lower_cost,int lower_weight,int upper_cost,int upper_weight)
	{
		    int j=0;
			for(Candies c : candy)
			{
				if(c.getCost()>=lower_cost && c.getCost()<=upper_cost)
				{
					System.out.println(c.toString());
					j++;
				}
			}
			if(j==0)
			 System.out.println("there are no candies in the range of cost given");
		    j=0;
            System.out.println("the candies upper and lower bounds of the weight:");
			for(Candies c : candy)
			{
				if(c.getWeight()>=lower_weight && c.getWeight()<=upper_weight)
				{
					System.out.println(c.toString());
					j++;
				}
			}
			if(j==0)
			 System.out.println("there are no candies in the range of weight given");
		
		
	    
	    
		
		
	}
}
