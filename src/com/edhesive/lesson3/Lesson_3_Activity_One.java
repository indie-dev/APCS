package com.edhesive.lesson3;

import java.util.Scanner;

class Lesson_3_Activity_One {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = s.nextLine();
		System.out.println("Hi "+name+", nice to see you.");
	}
}
