package com.epam1.maven1;
import items_in_a_gift.*;
import com.epam1.maven1.Gift_range;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.InputMismatchException;
public class New_year_gift
{
	
	private int total_cost_of_gift=0; //Encapsulation hiding the attributes 
	private int total_weight_of_gift=0; 
	ArrayList<Sweets> sweet=new ArrayList<Sweets>();
	ArrayList<Chocolates> chocolate=new ArrayList<Chocolates>();
	ArrayList<Candies> candy=new ArrayList<Candies>();
   public New_year_gift() 
	{
		
	}
   
    public static void main(String[] args) 
	{
    	try 
    	{
    		
    	New_year_gift gift=new New_year_gift();
		int choice,w,c,ch=1;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("------***Happy NEW YEAR***------");
		while(ch!=0)
		{
			System.out.println("1.To add a sweets"+"\n"+"2.To add a chocolates"+"\n"+"3.To add a candies");
			System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("enter the name,weight and cost of the sweets");
                s=sc.next();
                w=sc.nextInt();
                c=sc.nextInt();
                gift.total_cost_of_gift+=c;
                gift.total_weight_of_gift+=w;
                gift.sweet.add(new Sweets(s,w,c));
                break;
		case 2:System.out.println("enter the name,weight and cost of the chocolate");
	           s=sc.next();
	           w=sc.nextInt();
	           c=sc.nextInt();
	           gift.total_cost_of_gift+=c;
               gift.total_weight_of_gift+=w;
	           gift.chocolate.add(new Chocolates(s,w,c));
	           break;
		case 3:System.out.println("enter the name,weight and cost of the candy");
               s=sc.next();
               w=sc.nextInt();
               c=sc.nextInt();
               gift.total_cost_of_gift+=c;
               gift.total_weight_of_gift+=w;
               gift.candy.add(new Candies(s,w,c));
               break; 
        default:System.out.println("you have entered an invalid choice");       
		}
		System.out.println("Do you want to continue:");
		ch=sc.nextInt();
		}
		sc.close();
	    System.out.println("the contents of the gift are:");
		Gift_range m=new Gift_range();
		System.out.println("the candies are:");
		m.printCandies(gift.candy);
		System.out.println("the chocolates are:");
		m.printChocolates(gift.chocolate);
		System.out.println("the sweets are:");
		m.printSweets(gift.sweet);
		System.out.println();
		System.out.println("Total cost of the gift:"+gift.total_cost_of_gift);
		System.out.println("Total weight of the gift:"+gift.total_weight_of_gift);
		System.out.println("calculating the range of Candies:");
		Gift_range.Cal_Range_of_Candies(gift.candy,30,40,50,89);
		System.out.println("sorting the chooclates in the gift by means of criteria");
		gift.sorting_of_chocolates(gift.chocolate);
		m.printChocolates(gift.chocolate);
    	}
		catch(InputMismatchException e) {
    		System.out.println("InputMismatch Exception Occurred\n"
    				+ "Enter Valid Input to avoid Exception");
    	}
    	catch(Exception e) {
    		System.out.println("Exception " + e + " Occurred");
    	}
	}

    public void sorting_of_chocolates(ArrayList<Chocolates> chocolate)
    {
    	Collections.sort(chocolate);
    }
    

}
