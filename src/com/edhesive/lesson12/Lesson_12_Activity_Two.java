package com.edhesive.lesson12;

import java.util.Scanner;

public class Lesson_12_Activity_Two {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		double one = scanner.nextDouble();
		double two = scanner.nextDouble();
		if(one > two){
			System.out.println("Largest is: "+ one);
		}else{
			System.out.println("Largest is: "+two);
		}
	}
}
