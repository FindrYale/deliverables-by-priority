package edu.yale.cpsc112_lesson3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class CPSC112 {
	  public static void main(String[] args)
	  {
		  
	  }	  
	  
	  public static void processSalary(String inputSalary)
	  {
		  System.out.println(inputSalary);
		  int salary = Integer.parseInt(inputSalary);
		  if (salary > 250000)
		  {
			  System.out.println("You have a high tax rate.");
			  System.out.println("Obama thinks he's robin hood.");
		  }
		  else if (salary > 50000)
		  {
			  System.out.println("You have an average tax rate.");
			  System.out.println("At least you have a job.");
		  }
	  }
	}