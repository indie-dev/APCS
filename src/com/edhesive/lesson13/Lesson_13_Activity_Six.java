package com.edhesive.lesson13;

import java.util.Scanner;

public class Lesson_13_Activity_Six {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the temperature?");
		double num1 = scanner.nextDouble();
		if( num1 >= 99 && num1 <= 102){
			System.out.println("Temperature is OK");
		}else{
			System.out.println("WARNING");
		}
	}
}
