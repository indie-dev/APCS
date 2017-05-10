package com.edhesive.lesson3;

import java.util.Scanner;

class Lesson_3_Activity_Three {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Hi there. What is your name?");
		String name = s.nextLine();
		System.out.println("What adjective best describes you?");
		String adjective = s.nextLine();
		System.out.println("My name is "+name+". I am "+adjective+".");
	}
}
