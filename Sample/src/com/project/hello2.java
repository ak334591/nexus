package com.project;

import java.util.Scanner;

public class hello2 {
	 public static void main(String args[])
	   {
	      int a, y, z;
	      System.out.println("Enter two integers to calculate their sum ");
	      Scanner in = new Scanner(System.in);
	      a = in.nextInt();
	      y = in.nextInt();
	      z = a + y;
	      System.out.println("Sum of entered integers = "+z);
	   }
	}

