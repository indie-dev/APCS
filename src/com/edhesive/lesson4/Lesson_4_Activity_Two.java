package com.edhesive.lesson4;

import java.util.Scanner;

class Lesson_4_Activity_Two {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Hi there. What is your name?");
		String name = s.nextLine();
		System.out.println("Hi "+name+ ". How old are you?");
		int age = s.nextInt();
		System.out.println(name+", you will be 100 in "+(100 - age));
		throw new RuntimeException("Check the code, hehehe.");
	}
}
