package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the first number: ");
      int first = input.nextInt();//Input
      System.out.println("Enter the second number: ");
      int second = input.nextInt();//Input
      System.out.println("Enter the third number: ");
      int third = input.nextInt();//Input
        //IF statement to determine if any of the numbers equal each other
      if(first == second || second == third || third == first)
      {
          System.exit(0);
      }
      //Using IF/ELSE statements to see the greatest number listed
      int max = 0;
      if(first > second &&  first > third)
      {

              max += first;

      }
      else if(second > first && second > third)
      {

              max += second;

      }
      else
      {
          max += third;
      }

      System.out.println( "The largest number is " + max + "." );//Output
    }
}
