package com.edhesive.lesson5;

import java.util.Scanner;

class Lesson_5_Activity_Four {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a price: ");
		double ammt = s.nextDouble();
		System.out.println("Change from $20: $"+(20.00 - ammt));
	}
}
