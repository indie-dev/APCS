package com.edhesive.lesson14;

import java.util.Scanner;

public class Lesson_14_Activity_Three {

	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Please enter the first octet:");
	    int input1 = s.nextInt();
	    System.out.println("Please enter the second octet:");
	    int input2 = s.nextInt();
	    System.out.println("Please enter the third octet:");
	    int input3 = s.nextInt();
	    System.out.println("Please enter the fourth octet:");
	    int input4 = s.nextInt();
	    boolean valid = true;
	    if (input1 < 0 || input1 > 255) {
	      System.out.println("Octet 1 is incorrect");
	      valid = false;
	    }
	    if (input2 < 0 || input2 > 255) {
	      System.out.println("Octet 2 is incorrect");
	      valid = false;
	    }
	    if (input3 < 0 || input3 > 255) {
	      System.out.println("Octet 3 is incorrect");
	      valid = false;
	    }
	    if (input4 < 0 || input4 > 255) {
	      System.out.println("Octet 4 is incorrect");
	      valid = false;
	    }
	    if (valid) {
	      System.out.println("IP Address: "
	          + input1 + "." + input2 + "." + input3 + "." + input4);
	    }
	  }
	}