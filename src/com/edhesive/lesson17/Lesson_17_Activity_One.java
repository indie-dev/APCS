package com.edhesive.lesson17;

import java.util.Scanner;

public class Lesson_17_Activity_One {
	public static void main(String[] args){
		  System.out.println("Enter the Scores:");
		    Scanner scanner = new Scanner(System.in);
		    int input;
		    int total = 0;
		    int count = 0;
		    while ((input = scanner.nextInt()) != -1) {
		      total += input;
		      ++count;
		    }
		    System.out.println("The average is: " + (double) total / count);
	}
}
