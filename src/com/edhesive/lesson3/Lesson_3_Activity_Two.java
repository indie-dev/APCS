package com.edhesive.lesson3;

import java.util.Scanner;

class Lesson_3_Activity_Two {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter three names: ");
		String first = s.nextLine();
		String second = s.nextLine();
		String third = s.nextLine();
		System.out.println("\n");
		System.out.println(third+" "+second+" "+first);
	}
}
