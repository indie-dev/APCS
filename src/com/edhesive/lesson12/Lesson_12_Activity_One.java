package com.edhesive.lesson12;

import java.util.Scanner;

public class Lesson_12_Activity_One {
	  public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		    double avg = (s.nextDouble() + s.nextDouble() + s.nextDouble()) / 3.0;
		    if (avg >= 89.5) {
		      System.out.println("ABOVE AVERAGE");
		    }
	  }
}
