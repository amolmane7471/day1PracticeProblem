package day1PracticeProblem;

import java.util.Scanner;

public class LeapYear {
	   public static void main(String[] args){
	      int year;
	      System.out.println("Enter an Year : ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();
	      sc.close(); 
	      if(year<1582){
	    	  System.out.println("Enter a Year Greater than 1581");
	      }
	    	  else if (((year % 4 == 0) && (year % 100 != 0)) || (year%400 == 0))
	    	  {
	    		  System.out.println(+year+"  is a leap year");
	    	  }
	    		  else
	         System.out.println(+year+" is not a leap year");
	      }
	  }
	 