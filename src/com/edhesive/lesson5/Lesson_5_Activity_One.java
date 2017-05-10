package com.edhesive.lesson5;

import java.util.Scanner;

class Lesson_5_Activity_One {
	/**
	 * Answers:
	 * x+1
	 * 13.5
	 * -15.0
	 * -2
	 * 29
	 * @param args
	 */
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	double first = s.nextDouble();
    	double second = s.nextDouble();
    	System.out.println(""+(second - first));
    }
}